package com.example.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Model.Place;
import com.example.Repository.IPlaceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Model.GenericResponse;


@Service
public class PlaceService {
    private final IPlaceRepository placeRepository;

    public PlaceService(IPlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public GenericResponse<ArrayList<Place>> getPlaces() {

        try {
            var list = (ArrayList<Place>) placeRepository.findAll();
            return new GenericResponse<ArrayList<Place>>(HttpStatus.OK, "OK", true, list);

        } catch (Exception exception) {
            return new GenericResponse<ArrayList<Place>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Place> savePlace(Place place) {
        try {
            return new GenericResponse<Place>(HttpStatus.OK, "OK", true, placeRepository.save(place));

        } catch (Exception exception) {
            return new GenericResponse<Place>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Optional<Place>> getById(Long id) {


        try {
            return new GenericResponse<Optional<Place>>(HttpStatus.OK, "OK", true, placeRepository.findById(id));

        } catch (Exception exception) {
            return new GenericResponse<Optional<Place>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }


}