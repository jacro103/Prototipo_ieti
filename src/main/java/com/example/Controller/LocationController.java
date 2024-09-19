package com.example.Controller;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Model.GenericResponse;
import com.example.Model.Location;
import com.example.Service.LocationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
@CrossOrigin(origins = "http://localhost:4200")
public class LocationController {
    private final LocationService locationService;


    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping()
    public GenericResponse<ArrayList<Location>> getLocations() { return locationService.getLocations(); }

    @PostMapping()
    public GenericResponse<Location> saveLocation(@RequestBody Location location) {return this.locationService.saveLocation(location);}

    @GetMapping("/{id}")
    public GenericResponse<Optional<Location>> getLocation(@PathVariable Long id) {return this.locationService.getById(id);}
}
