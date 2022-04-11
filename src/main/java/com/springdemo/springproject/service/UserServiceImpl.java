package com.springdemo.springproject.service;

import com.springdemo.springproject.model.User;
import com.springdemo.springproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl  implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
         return (List<User>) userRepository.findAll();

    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findAllById(id);
    }

    @Override
    public void saveOrUpdate(User user) {
    userRepository.save(user);

    }

    @Override
    public void deleteUser(Long id) {
       userRepository.deleteById(id);

    }

}
