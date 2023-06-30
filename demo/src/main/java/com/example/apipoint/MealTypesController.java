package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealTypesController {
    private final MealTpesRepo repository;

    public MealTypesController(MealTpesRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/api/meal_types")
    public List<MealTypes> getMealTypes() {

        System.out.println("API endpoint '/api/meal_types'  called");
        return repository.findAll();
    }
}
