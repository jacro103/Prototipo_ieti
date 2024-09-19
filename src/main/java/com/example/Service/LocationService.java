package com.example.Service;
import java.util.ArrayList;
import java.util.Optional;

import com.example.Model.Location;
import com.example.Repository.ILocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Model.GenericResponse;


@Service
public class LocationService {
    private final ILocationRepository locationRepository;

    public LocationService(ILocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public GenericResponse<ArrayList<Location>> getLocations() {

        try {
            var list = (ArrayList<Location>) locationRepository.findAll();
            return new GenericResponse<ArrayList<Location>>(HttpStatus.OK, "OK", true, list);

        } catch (Exception exception) {
            return new GenericResponse<ArrayList<Location>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Location> saveLocation(Location location) {
        try {
            return new GenericResponse<Location>(HttpStatus.OK, "OK", true, locationRepository.save(location));

        } catch (Exception exception) {
            return new GenericResponse<Location>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Optional<Location>> getById(Long id) {


        try {
            return new GenericResponse<Optional<Location>>(HttpStatus.OK, "OK", true, locationRepository.findById(id));

        } catch (Exception exception) {
            return new GenericResponse<Optional<Location>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }


}
