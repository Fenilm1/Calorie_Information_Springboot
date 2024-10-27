package com.example.demo.controller;

import com.example.demo.model.CalorieData;
import com.example.demo.service.CalorieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/food")
public class FoodItemController {

    @Autowired
    private CalorieDataService foodItemService;

    // Endpoint to search food items by name
    @GetMapping("/{foodName}")
    public List<CalorieData> getFoodItemsByName(@PathVariable("foodName") String foodName) {
        return foodItemService.findFoodItemsByName(foodName);
    }
}

