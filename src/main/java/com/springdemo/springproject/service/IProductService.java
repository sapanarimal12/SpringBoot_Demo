package com.springdemo.springproject.service;

import com.springdemo.springproject.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
