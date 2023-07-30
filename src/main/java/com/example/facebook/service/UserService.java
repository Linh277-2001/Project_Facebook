package com.example.facebook.service;

import com.example.facebook.model.User;
import com.example.facebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User getLogin(String username, String password){
        return userRepository.findUserByUsernameAndPassword(username,password);
    }
}