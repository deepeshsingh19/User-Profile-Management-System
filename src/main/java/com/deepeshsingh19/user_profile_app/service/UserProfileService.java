package com.deepeshsingh19.user_profile_app.service;

import com.deepeshsingh19.user_profile_app.model.UserProfile;
import com.deepeshsingh19.user_profile_app.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository repository;

    // Get all users
    public List<UserProfile> getAllUsers() {
        return repository.findAll();
    }

    // Add a new user
    public UserProfile addUser(UserProfile user) {
        return repository.save(user);
    }
}
