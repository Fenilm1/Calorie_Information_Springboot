import React from "react";
import { QueryClient, QueryClientProvider } from "@tanstack/react-query";
import FoodCalorieChecker from "./food-calorie-checker";

const queryClient = new QueryClient();

function App() {
	return (
		<QueryClientProvider client={queryClient}>
			<div className="App">
				<FoodCalorieChecker />
			</div>
		</QueryClientProvider>
	);
}

export default App;
