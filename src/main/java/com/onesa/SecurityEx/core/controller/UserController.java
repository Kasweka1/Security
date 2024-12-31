package com.onesa.SecurityEx.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onesa.SecurityEx.core.model.User;
import com.onesa.SecurityEx.core.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registration(@RequestBody User user) {
        return userService.registerUser(user);
    }


    @PostMapping("/login")
    public String login(@RequestBody User user) {
       
        return userService.login(user);
    }

    
}
