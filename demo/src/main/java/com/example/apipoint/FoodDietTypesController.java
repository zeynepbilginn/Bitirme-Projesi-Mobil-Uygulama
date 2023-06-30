package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodDietTypesController {
    private final FoodDietTypesRepository repository;

    public FoodDietTypesController(FoodDietTypesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/food_diet_types")
    public List<FoodDietTypes> getFoodDietTypes() {
        System.out.println("API endpoint '/api/food_diet_types'  called");
        return repository.findAll();
    }
}