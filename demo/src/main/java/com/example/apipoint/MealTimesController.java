package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealTimesController {
    private final MealTimesRepo repository;

    public MealTimesController(MealTimesRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/api/meal_times")
    public List<MealTimes> getMealTimes() {
        System.out.println("API endpoint '/api/meal_times'  called");
        return repository.findAll();
    }
}