package com.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authservice.entity.User;
import com.authservice.service.AuthService;

@RestController
public class AuthController {
	
	@Autowired
    private AuthService authService;

    // Signup
    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return authService.register(user);
    }

    // Login
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return authService.login(user.getEmail(), user.getPassword());
    }

}
