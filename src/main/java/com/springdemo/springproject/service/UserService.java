package com.springdemo.springproject.service;

import com.springdemo.springproject.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

     public User login(String username, String password);

    public List<User> getAllUser();
    public  User getUserById(Long id);
    public  void saveOrUpdate(User user);
    public void deleteUser(Long id);


}
