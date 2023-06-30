package com.example.apipoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodInTheMealController {
    private final FoodInTheMealRepo repository;
    private final FoodInTheMealService service;

    @Autowired
    public FoodInTheMealController(FoodInTheMealRepo repository, FoodInTheMealService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/api/food_in_the_meal")
    public List<FoodInTheMealDTO> getFoodInTheMeal() {
        System.out.println("API endpoint '/api/food_in_the_meal'  called");
        List<FoodInTheMeal> entities = repository.findAll();
        return service.dtoFoodMeal(entities);
    }
}
