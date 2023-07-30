package com.example.facebook.controller;

import com.example.facebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/login")
    public int findUser(@RequestParam String username, @RequestParam String password){

        return  userService.getLogin(username,password).getUser_id();
    }

}