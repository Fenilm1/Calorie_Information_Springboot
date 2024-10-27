package com.example.demo.model;

//import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calorie_data")
public class CalorieData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String foodCode;
    private String displayName;
    private Double portionDefault;
    private Double portionAmount;
    private String portionDisplayName;
    private Double factor;
    private Double increment;
    private Double multiplier;
    private Double grains;
    private Double wholeGrains;
    private Double vegetables;
    private Double orangeVegetables;
    private Double drkgreenVegetables;
    private Double starchyVegetables;
    private Double otherVegetables;
    private Double fruits;
    private Double milk;
    private Double meats;
    private Double soy;
    private Double drybeansPeas;
    private Double oils;
    private Double solidFats;
    private Double addedSugars;
    private Double alcohol;
    private Double calories;
    private Double saturatedFats;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFoodCode() {
		return foodCode;
	}
	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Double getPortionDefault() {
		return portionDefault;
	}
	public void setPortionDefault(Double portionDefault) {
		this.portionDefault = portionDefault;
	}
	public Double getPortionAmount() {
		return portionAmount;
	}
	public void setPortionAmount(Double portionAmount) {
		this.portionAmount = portionAmount;
	}
	public String getPortionDisplayName() {
		return portionDisplayName;
	}
	public void setPortionDisplayName(String portionDisplayName) {
		this.portionDisplayName = portionDisplayName;
	}
	public Double getFactor() {
		return factor;
	}
	public void setFactor(Double factor) {
		this.factor = factor;
	}
	public Double getIncrement() {
		return increment;
	}
	public void setIncrement(Double increment) {
		this.increment = increment;
	}
	public Double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(Double multiplier) {
		this.multiplier = multiplier;
	}
	public Double getGrains() {
		return grains;
	}
	public void setGrains(Double grains) {
		this.grains = grains;
	}
	public Double getWholeGrains() {
		return wholeGrains;
	}
	public void setWholeGrains(Double wholeGrains) {
		this.wholeGrains = wholeGrains;
	}
	public Double getVegetables() {
		return vegetables;
	}
	public void setVegetables(Double vegetables) {
		this.vegetables = vegetables;
	}
	public Double getOrangeVegetables() {
		return orangeVegetables;
	}
	public void setOrangeVegetables(Double orangeVegetables) {
		this.orangeVegetables = orangeVegetables;
	}
	public Double getDrkgreenVegetables() {
		return drkgreenVegetables;
	}
	public void setDrkgreenVegetables(Double drkgreenVegetables) {
		this.drkgreenVegetables = drkgreenVegetables;
	}
	public Double getStarchyVegetables() {
		return starchyVegetables;
	}
	public void setStarchyVegetables(Double starchyVegetables) {
		this.starchyVegetables = starchyVegetables;
	}
	public Double getOtherVegetables() {
		return otherVegetables;
	}
	public void setOtherVegetables(Double otherVegetables) {
		this.otherVegetables = otherVegetables;
	}
	public Double getFruits() {
		return fruits;
	}
	public void setFruits(Double fruits) {
		this.fruits = fruits;
	}
	public Double getMilk() {
		return milk;
	}
	public void setMilk(Double milk) {
		this.milk = milk;
	}
	public Double getMeats() {
		return meats;
	}
	public void setMeats(Double meats) {
		this.meats = meats;
	}
	public Double getSoy() {
		return soy;
	}
	public void setSoy(Double soy) {
		this.soy = soy;
	}
	public Double getDrybeansPeas() {
		return drybeansPeas;
	}
	public void setDrybeansPeas(Double drybeansPeas) {
		this.drybeansPeas = drybeansPeas;
	}
	public Double getOils() {
		return oils;
	}
	public void setOils(Double oils) {
		this.oils = oils;
	}
	public Double getSolidFats() {
		return solidFats;
	}
	public void setSolidFats(Double solidFats) {
		this.solidFats = solidFats;
	}
	public Double getAddedSugars() {
		return addedSugars;
	}
	public void setAddedSugars(Double addedSugars) {
		this.addedSugars = addedSugars;
	}
	public Double getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(Double alcohol) {
		this.alcohol = alcohol;
	}
	public Double getCalories() {
		return calories;
	}
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	public Double getSaturatedFats() {
		return saturatedFats;
	}
	public void setSaturatedFats(Double saturatedFats) {
		this.saturatedFats = saturatedFats;
	}

    // Getters and setters
    
}
