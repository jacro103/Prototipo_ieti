package com.example.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Model.GenericResponse;
import com.example.Model.User;
import com.example.Repository.IUserRepository;

@Service
public class UserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public GenericResponse<ArrayList<User>> getUsers (){

        try {
            var list = (ArrayList<User>) userRepository.findAll();
            return new GenericResponse<ArrayList<User>>(HttpStatus.OK, "OK", true, list);

        } catch (Exception exception) {
            return new GenericResponse<ArrayList<User>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<User> saveUser(User user){
        try {
            return new GenericResponse<User>(HttpStatus.OK, "OK", true, userRepository.save(user));

        } catch (Exception exception) {
            return new GenericResponse<User>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Optional<User>> getById(Long id){
   
        
        try {
            return new GenericResponse<Optional<User>>(HttpStatus.OK, "OK", true, userRepository.findById(id));

        } catch (Exception exception) {
            return new GenericResponse<Optional<User>>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }


    public GenericResponse<User> login(String email, String password){
        try {
            User user = userRepository.findByEmail(email);
            if (user != null && user.getPassword().equals(password)) {
                return new GenericResponse<User>(HttpStatus.OK, "OK", true, user);
            } else {
                return new GenericResponse<User>(HttpStatus.UNAUTHORIZED, "Invalid credentials", false, null);
            }
        } catch (Exception exception) {
            return new GenericResponse<User>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }


}