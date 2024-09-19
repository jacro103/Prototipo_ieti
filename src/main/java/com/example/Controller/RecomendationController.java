package com.example.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.GenericResponse;
import com.example.Model.Recomendation;
import com.example.Service.RecomendationService;

@RestController
@RequestMapping("/recomendation")
@CrossOrigin(origins = "http://localhost:4200")

public class RecomendationController {
    private final RecomendationService recomendationService;

    public RecomendationController(RecomendationService recomendationService) {
        this.recomendationService = recomendationService;
    }

    @GetMapping()
    public GenericResponse<ArrayList<Recomendation>> getRecomendations() {
        return this.recomendationService.getRecomendations();
    }

    @PostMapping()
    public GenericResponse<Recomendation> saveRecomendation(@RequestBody Recomendation recomendation) {
        return this.recomendationService.saveRecomendation(recomendation);
    }

    @GetMapping("/{id}")
    public GenericResponse<Optional<Recomendation>> getRecomendation(@PathVariable Long id) {
        return this.recomendationService.getById(id);
    }
}
