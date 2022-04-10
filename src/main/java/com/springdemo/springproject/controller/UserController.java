package com.springdemo.springproject.controller;


import com.springdemo.springproject.model.User;
import com.springdemo.springproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/add-user" ,method = RequestMethod.POST)
    public User  addUser(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user;
    }

    @GetMapping("/list")
    public List<User> list(){
        return userService.getAllUser();
    }

    @GetMapping("/list/{id}")
    public  User getById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return  "User with id:"+id+ " deleted Successfully";
    }

    @RequestMapping("/")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView("login");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }

    @PostMapping("/login")
    public  String login(@ModelAttribute("user") User user){

        User authUser1=userService.login(user.getUsername(),user.getPassword());
        System.out.println(authUser1);
        if(Objects.nonNull(authUser1)){
            return "redirect:/";

        }
        else {
            return "redirect:/login";
        }
    }
}
