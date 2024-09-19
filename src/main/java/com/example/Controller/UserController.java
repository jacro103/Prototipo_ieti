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
import com.example.Model.User;
import com.example.Service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public GenericResponse<ArrayList<User>> getUsers() {
        return this.userService.getUsers();
    }

    @PostMapping()
    public GenericResponse<User> saveUser(@RequestBody User user) {
        return this.userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public GenericResponse<Optional<User>> getUser(@PathVariable Long id) {
        return this.userService.getById(id);
    }

    @PostMapping("/login")
    public GenericResponse<User> login(@RequestBody User loginUser) {
        return this.userService.login(loginUser.getEmail(), loginUser.getPassword());
    }

    @PostMapping("/create")
    public GenericResponse<User> createUser(@RequestBody User user) {
        System.out.println("Received request to create user: " + user);
        return this.userService.saveUser(user);
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "Controller is working!";
    }

}