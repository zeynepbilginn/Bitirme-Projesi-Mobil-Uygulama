package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VitaminsController {
    private final VitaminsRepository repository;

    public VitaminsController(VitaminsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/vitamins")
    public List<Vitamins> getVitamins() {
        System.out.println("API endpoint '/api/vitamins'  called");
        return repository.findAll();
    }
}