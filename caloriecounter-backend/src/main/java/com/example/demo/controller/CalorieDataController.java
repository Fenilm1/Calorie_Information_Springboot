package com.example.demo.controller;

import com.example.demo.model.CalorieData;

import com.example.demo.repository.CalorieDataRepository;
import com.example.demo.service.CalorieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class CalorieDataController {

    @Autowired
    private CalorieDataService calorieDataService;

    @Autowired
    private CalorieDataRepository calorieDataRepository;

    @GetMapping("/load-data")
    public String loadData() {
        File xmlFile = new File("C:\\Users\\fenil\\Downloads\\myfoodapediadata\\Food_Display_Table.xml"); // Replace with your XML file path
        calorieDataService.loadXmlData(xmlFile);
        return "Data loaded successfully!";
    }

    @GetMapping("/demo")
    public List<CalorieData> getDemoData() {
        return calorieDataRepository.findAll().subList(213, 215);  // Return first 5 entries
    }
}
