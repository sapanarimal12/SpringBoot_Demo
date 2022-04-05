package com.springdemo.springproject.controller;

import com.springdemo.springproject.model.Customer;
import com.springdemo.springproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;

@RestController
@RequestMapping(value = "api/example" ,method = RequestMethod.GET)
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/list")
    @ResponseBody
    public List<Customer> getList(){
        return customerService.getList();
    }





}
