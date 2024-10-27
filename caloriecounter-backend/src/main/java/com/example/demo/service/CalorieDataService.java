package com.example.demo.service;

import com.example.demo.model.CalorieData;
import com.example.demo.repository.CalorieDataRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.*;

@Service
public class CalorieDataService {

    @Autowired
    private CalorieDataRepository calorieDataRepository;
    
    public List<CalorieData> findFoodItemsByName(String name) {
        return calorieDataRepository.findByDisplayNameContainingIgnoreCase(name);
    }
    
    @Transactional
    public void loadXmlData(File xmlFile) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Food_Display_Row");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    CalorieData calorieData = new CalorieData();
                    calorieData.setFoodCode(element.getElementsByTagName("Food_Code").item(0).getTextContent());
                    calorieData.setDisplayName(element.getElementsByTagName("Display_Name").item(0).getTextContent());
                    calorieData.setPortionDefault(Double.valueOf(element.getElementsByTagName("Portion_Default").item(0).getTextContent()));
                    calorieData.setPortionAmount(Double.valueOf(element.getElementsByTagName("Portion_Amount").item(0).getTextContent()));
                    calorieData.setPortionDisplayName(element.getElementsByTagName("Portion_Display_Name").item(0).getTextContent());
                    calorieData.setFactor(Double.valueOf(element.getElementsByTagName("Factor").item(0).getTextContent()));
                    calorieData.setIncrement(Double.valueOf(element.getElementsByTagName("Increment").item(0).getTextContent()));
                    calorieData.setMultiplier(Double.valueOf(element.getElementsByTagName("Multiplier").item(0).getTextContent()));
                    calorieData.setGrains(Double.valueOf(element.getElementsByTagName("Grains").item(0).getTextContent()));
                    calorieData.setWholeGrains(Double.valueOf(element.getElementsByTagName("Whole_Grains").item(0).getTextContent()));
                    calorieData.setVegetables(Double.valueOf(element.getElementsByTagName("Vegetables").item(0).getTextContent()));
                    calorieData.setOrangeVegetables(Double.valueOf(element.getElementsByTagName("Orange_Vegetables").item(0).getTextContent()));
                    calorieData.setDrkgreenVegetables(Double.valueOf(element.getElementsByTagName("Drkgreen_Vegetables").item(0).getTextContent()));
                    calorieData.setStarchyVegetables(Double.valueOf(element.getElementsByTagName("Starchy_vegetables").item(0).getTextContent()));
                    calorieData.setOtherVegetables(Double.valueOf(element.getElementsByTagName("Other_Vegetables").item(0).getTextContent()));
                    calorieData.setFruits(Double.valueOf(element.getElementsByTagName("Fruits").item(0).getTextContent()));
                    calorieData.setMilk(Double.valueOf(element.getElementsByTagName("Milk").item(0).getTextContent()));
                    calorieData.setMeats(Double.valueOf(element.getElementsByTagName("Meats").item(0).getTextContent()));
                    calorieData.setSoy(Double.valueOf(element.getElementsByTagName("Soy").item(0).getTextContent()));
                    calorieData.setDrybeansPeas(Double.valueOf(element.getElementsByTagName("Drybeans_Peas").item(0).getTextContent()));
                    calorieData.setOils(Double.valueOf(element.getElementsByTagName("Oils").item(0).getTextContent()));
                    calorieData.setSolidFats(Double.valueOf(element.getElementsByTagName("Solid_Fats").item(0).getTextContent()));
                    calorieData.setAddedSugars(Double.valueOf(element.getElementsByTagName("Added_Sugars").item(0).getTextContent()));
                    calorieData.setAlcohol(Double.valueOf(element.getElementsByTagName("Alcohol").item(0).getTextContent()));
                    calorieData.setCalories(Double.valueOf(element.getElementsByTagName("Calories").item(0).getTextContent()));
                    calorieData.setSaturatedFats(Double.valueOf(element.getElementsByTagName("Saturated_Fats").item(0).getTextContent()));

                    calorieDataRepository.save(calorieData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
