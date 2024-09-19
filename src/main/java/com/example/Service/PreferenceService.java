package com.example.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Model.Preference;
import com.example.Repository.IPreferenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Model.GenericResponse;


@Service
public class PreferenceService {
    private final IPreferenceRepository preferenceRepository;

    public PreferenceService(IPreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    public GenericResponse<ArrayList<Preference>> getPreferences() {

        try {
            var list = (ArrayList<Preference>) preferenceRepository.findAll();
            return new GenericResponse<ArrayList<Preference>>(HttpStatus.OK, "OK", true, list);

        } catch (Exception exception) {
            return new GenericResponse<ArrayList<Preference>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Preference> savePreference(Preference preference) {
        try {
            return new GenericResponse<Preference>(HttpStatus.OK, "OK", true, preferenceRepository.save(preference));

        } catch (Exception exception) {
            return new GenericResponse<Preference>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Optional<Preference>> getById(Long id) {


        try {
            return new GenericResponse<Optional<Preference>>(HttpStatus.OK, "OK", true, preferenceRepository.findById(id));

        } catch (Exception exception) {
            return new GenericResponse<Optional<Preference>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }


}