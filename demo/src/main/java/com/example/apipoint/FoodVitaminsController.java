package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodVitaminsController {
    private final FoodVitaminsRepo repository;

    public FoodVitaminsController(FoodVitaminsRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/api/food_vitamins")
    public List<FoodVitamins> getFoodVitamins() {
        System.out.println("API endpoint '/api/food_vitamins'  called");
        return repository.findAll();
    }
}