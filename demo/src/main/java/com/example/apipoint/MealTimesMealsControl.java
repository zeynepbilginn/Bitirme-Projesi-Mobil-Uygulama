package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealTimesMealsControl {
    private final MealTimeMealsRepo repository;

    public MealTimesMealsControl(MealTimeMealsRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/api/meal_times_meals")
    public List<MealTimesMeals> getMealTimesMeals() {
        System.out.println("API endpoint '/api/meal_times_meals'  called");
        return repository.findAll();
    }
}