package com.springdemo.springproject.service;

import com.springdemo.springproject.model.Laptop;
import com.springdemo.springproject.model.Student;
import com.springdemo.springproject.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaptopService {

    private LaptopRepository laptopRepository;

}
