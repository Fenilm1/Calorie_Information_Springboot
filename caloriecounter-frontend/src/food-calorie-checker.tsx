"use client";

import { useState } from "react";
import { useQuery } from "@tanstack/react-query";
import axios from "axios";
import { Search } from "lucide-react";

import { Button } from "@/components/ui/button";
import {
	Card,
	CardContent,
	CardDescription,
	CardHeader,
	CardTitle,
} from "@/components/ui/card";
import { Input } from "@/components/ui/input";
import {
	Accordion,
	AccordionContent,
	AccordionItem,
	AccordionTrigger,
} from "@/components/ui/accordion";

interface FoodItem {
	id: number;
	foodCode: string;
	displayName: string;
	portionDefault: number;
	portionAmount: number;
	portionDisplayName: string;
	factor: number;
	increment: number;
	multiplier: number;
	grains: number;
	wholeGrains: number;
	vegetables: number;
	orangeVegetables: number;
	drkgreenVegetables: number;
	starchyVegetables: number;
	otherVegetables: number;
	fruits: number;
	milk: number;
	meats: number;
	soy: number;
	drybeansPeas: number;
	oils: number;
	solidFats: number;
	addedSugars: number;
	alcohol: number;
	calories: number;
	saturatedFats: number;
}

export default function FoodCalorieChecker() {
	const [searchTerm, setSearchTerm] = useState("");

	const { data, error, isLoading, refetch } = useQuery({
		queryKey: ["foodData", searchTerm],
		queryFn: async () => {
			if (!searchTerm) return [];
			const response = await axios.get<FoodItem[]>(
				`http://localhost:8080/api/food/${searchTerm}`
			);
			return response.data;
		},
		enabled: false,
	});

	const handleSearch = (e: React.FormEvent) => {
		e.preventDefault();
		refetch();
	};

	return (
		<div className="container mx-auto p-4 max-w-4xl">
			<h1 className="text-3xl font-bold text-center mb-8">
				Check How Many Calories
			</h1>
			<form onSubmit={handleSearch} className="flex gap-2 mb-8">
				<Input
					type="text"
					placeholder="Search for a food item..."
					value={searchTerm}
					onChange={(e) => setSearchTerm(e.target.value)}
					className="flex-grow"
				/>
				<Button type="submit">
					<Search className="mr-2 h-4 w-4" /> Search
				</Button>
			</form>

			{isLoading && <p className="text-center">Loading...</p>}
			{error && (
				<p className="text-center text-red-500">
					An error occurred. Please try again.
				</p>
			)}

			{data && data.length > 0 && (
				<div className="grid gap-4 md:grid-cols-2">
					{data.map((item) => (
						<Card key={item.id} className="overflow-hidden">
							<CardHeader className="pb-2">
								<CardTitle>{item.displayName}</CardTitle>
								<CardDescription>
									Food Code: {item.foodCode}
								</CardDescription>
							</CardHeader>
							<Accordion type="single" collapsible>
								<AccordionItem value="details">
									<AccordionTrigger className="px-6">
										View Details
									</AccordionTrigger>
									<AccordionContent>
										<CardContent>
											<dl className="grid grid-cols-2 gap-2 text-sm">
												<div>
													<dt className="font-semibold">
														Calories:
													</dt>
													<dd>{item.calories}</dd>
												</div>
												<div>
													<dt className="font-semibold">
														Portion:
													</dt>
													<dd>
														{item.portionAmount}{" "}
														{
															item.portionDisplayName
														}
													</dd>
												</div>
												<div>
													<dt className="font-semibold">
														Saturated Fats:
													</dt>
													<dd>
														{item.saturatedFats.toFixed(
															2
														)}
														g
													</dd>
												</div>
												<div>
													<dt className="font-semibold">
														Fruits:
													</dt>
													<dd>
														{item.fruits.toFixed(2)}
													</dd>
												</div>
												<div>
													<dt className="font-semibold">
														Vegetables:
													</dt>
													<dd>
														{item.vegetables.toFixed(
															2
														)}
													</dd>
												</div>
												<div>
													<dt className="font-semibold">
														Grains:
													</dt>
													<dd>
														{item.grains.toFixed(2)}
													</dd>
												</div>
											</dl>
										</CardContent>
									</AccordionContent>
								</AccordionItem>
							</Accordion>
						</Card>
					))}
				</div>
			)}

			{data && data.length === 0 && searchTerm && (
				<p className="text-center">
					No results found for "{searchTerm}"
				</p>
			)}
		</div>
	);
}
