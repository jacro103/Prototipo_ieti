package com.example.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Model.GenericResponse;
import com.example.Model.Recomendation;
import com.example.Repository.IRecomendationRepository;

@Service
public class RecomendationService {
    private final IRecomendationRepository recomendationRepository;

    public RecomendationService(IRecomendationRepository recomendationRepository) {
        this.recomendationRepository = recomendationRepository;
    }

    public GenericResponse<ArrayList<Recomendation>> getRecomendations() {
        try {
            var list = (ArrayList<Recomendation>) recomendationRepository.findAll();
            return new GenericResponse<>(HttpStatus.OK, "OK", true, list);

        } catch (Exception exception) {
            return new GenericResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }

    public GenericResponse<Recomendation> saveRecomendation(Recomendation recomendation) {
        try {
            return new GenericResponse<>(HttpStatus.OK, "OK", true, recomendationRepository.save(recomendation));

        } catch (Exception exception) {
            return new GenericResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }

    public GenericResponse<Optional<Recomendation>> getById(Long id) {
        try {
            return new GenericResponse<>(HttpStatus.OK, "OK", true, recomendationRepository.findById(id));

        } catch (Exception exception) {
            return new GenericResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }
}
