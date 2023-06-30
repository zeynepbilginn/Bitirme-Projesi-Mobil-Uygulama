package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodSeasonsController {
    private final FoodSeasonsRepo repository;

    public FoodSeasonsController(FoodSeasonsRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/api/food_seasons")
    public List<FoodSeasons> getFoodSeasons() {
        System.out.println("API endpoint '/api/food_seasons'  called");
        return repository.findAll();
    }
}