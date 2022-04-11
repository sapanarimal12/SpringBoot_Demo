package com.springdemo.springproject.service;

import com.springdemo.springproject.model.User;
import com.springdemo.springproject.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service()
public class UserDetailServiceImpl implements UserDetailsService  {

    private  final UserRepository userRepository;

    public UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return userRepository
                .findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Email/Password is  not correct"));


    }
}
