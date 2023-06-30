package com.example.apipoint;


import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {
    private final FoodRepository repository;

    public FoodController(FoodRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/food")
    public List<Food> getFood() {
        System.out.println("API endpoint '/api/food'  called");
        return repository.findAll();
    }
}