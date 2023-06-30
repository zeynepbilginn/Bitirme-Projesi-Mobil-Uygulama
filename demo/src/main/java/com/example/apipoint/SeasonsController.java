package com.example.apipoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeasonsController {
    private final SeasonsRepository repository;

    public SeasonsController(SeasonsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/seasons")
    public List<Seasons> getSeasons() {
        System.out.println("API endpoint '/api/seasons'  called");
        return repository.findAll();
    }
}
