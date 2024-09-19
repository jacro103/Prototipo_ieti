package com.example.Controller;


import java.util.ArrayList;
import java.util.Optional;

import com.example.Model.GenericResponse;
import com.example.Model.Place;
import com.example.Service.PlaceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/place")
@CrossOrigin(origins = "http://localhost:4200")
public class PlaceController {
    private final PlaceService placeService;


    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }
    @GetMapping()
    public GenericResponse<ArrayList<Place>> getPlaces() { return placeService.getPlaces(); }

    @PostMapping()
    public GenericResponse<Place> savePlace(@RequestBody Place place) {return this.placeService.savePlace(place);}

    @GetMapping("/{id}")
    public GenericResponse<Optional<Place>> getPlace(@PathVariable Long id) {return this.placeService.getById(id);}

}
