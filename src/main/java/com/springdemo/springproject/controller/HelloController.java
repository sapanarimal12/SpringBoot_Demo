package com.springdemo.springproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public  String helloWorld(){
        return "Ths is spring boot demonstration";
    }
    @RequestMapping("/hi")
    public String hii(){
        return "Hi from Here";
    }

}
