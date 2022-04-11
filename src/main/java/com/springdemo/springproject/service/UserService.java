package com.springdemo.springproject.service;

import com.springdemo.springproject.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    public List<User> getAllUser();
    public  User getUserById(Long id);
    public  void saveOrUpdate(User user);
    public void deleteUser(Long id);


}
