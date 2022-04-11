package com.springdemo.springproject.controller;


import com.springdemo.springproject.dto.Response;
import com.springdemo.springproject.manager.LoginManager;
import com.springdemo.springproject.repository.UserRepository;
import com.springdemo.springproject.request.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthController {


    private  final LoginManager loginManager;

    public AuthController(LoginManager loginManager) {
        this.loginManager = loginManager;
    }

    @PostMapping("/login")
    public Response authenticateUser(@RequestBody @Valid LoginRequest request){
        return loginManager.login(request);

    }

}
