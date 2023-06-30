package com.example.apipoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealsController {
    private final MealsRepo repository;

    private final MealsService service;

    @Autowired
    public MealsController(MealsRepo repository, MealsService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/api/meals")
    public List<MealsDTO> getMeals() {
        System.out.println("API endpoint '/api/meals'  called");

        List<Meals> entities = repository.findAll();
        return service.dtoMeal(entities);
    }
}
