 package com.example.apipoint;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
public class MineralsController {
    private final MineralsRepository repository;

    public MineralsController(MineralsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/minerals")
    public List<Minerals> getMinerals() {
        System.out.println("API endpoint '/api/minerals'  called");
        return repository.findAll();
    }
}
