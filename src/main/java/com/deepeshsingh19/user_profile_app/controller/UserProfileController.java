package com.deepeshsingh19.user_profile_app.controller;

import com.deepeshsingh19.user_profile_app.model.UserProfile;
import com.deepeshsingh19.user_profile_app.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    @Autowired
    private UserProfileService service;

    // Get all users
    @GetMapping
    public List<UserProfile> getUsers() {
        return service.getAllUsers();
    }

    // Add a new user
    @PostMapping
    public ResponseEntity<UserProfile> createUser(@RequestBody UserProfile user) {
        UserProfile savedUser = service.addUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
