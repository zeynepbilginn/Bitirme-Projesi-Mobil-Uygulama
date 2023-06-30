package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DietTypesController {
    private final DietTypesRepository repository;

    public DietTypesController(DietTypesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/diet_types")
    public List<DietTypes> getDietTypes() {
        System.out.println("API endpoint '/api/diet_types'  called");
        return repository.findAll();
    }
}
