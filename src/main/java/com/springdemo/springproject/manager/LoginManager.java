package com.springdemo.springproject.manager;


import com.springdemo.springproject.builder.ResponseBuilder;
import com.springdemo.springproject.dto.Response;
import com.springdemo.springproject.model.User;
import com.springdemo.springproject.repository.UserRepository;
import com.springdemo.springproject.request.LoginRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LoginManager {


    private final UserDetailsService userDetailsService;

    public LoginManager(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public Response login(LoginRequest request) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmailAddress());
        String requestPassword = request.getPassword();
        String savedPassword = userDetails.getPassword();

        if (requestPassword.equals(savedPassword)){
            return  ResponseBuilder.success("Login Successful" +userDetails);
        }
        else{
            return ResponseBuilder.failure("Email/Password is incorrect");
        }
    }
}