package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    public class FoodMineralsController {
        private final FoodMineralsRepo repository;

        public FoodMineralsController(FoodMineralsRepo repository) {
            this.repository = repository;
        }

        @GetMapping("/api/food_minerals")
        public List<FoodMinerals> getFoodMinerals() {
            System.out.println("API endpoint '/api/food_minerals'  called");
            return repository.findAll();
        }
}
