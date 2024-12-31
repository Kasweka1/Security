package com.onesa.SecurityEx.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/greet")
public class GreetController {

    @GetMapping
    public String greet(HttpServletRequest request) {
        return "Hello, Welcome to Spring Security " + request.getSession().getId();

    }
  
    
}
