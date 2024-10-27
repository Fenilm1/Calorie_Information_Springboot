package com.example.demo.repository;

import com.example.demo.model.CalorieData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalorieDataRepository extends JpaRepository<CalorieData, Long> {
	// Method to find all food items by the display name (case-insensitive)
    List<CalorieData> findByDisplayNameContainingIgnoreCase(String displayName);
}
