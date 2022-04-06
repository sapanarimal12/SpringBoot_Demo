package com.springdemo.springproject.service;

import com.springdemo.springproject.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerService {
    private  static List<Customer> list =new ArrayList<>();


    static {
        Customer c=new Customer();
        c.setId(1L);
        c.setName("Customer1");
        c.setAge(20L);
        c.setLocation("Nepal");
        list.add(c);

        c=new Customer();
        c.setId(2L);
        c.setName("Customer2");
        c.setAge(28L);
        c.setLocation("Nepal");
        list.add(c);


        c=new Customer();
        c.setId(3L);
        c.setName("Customer3");
        c.setAge(29L);
        c.setLocation("Nepal");
        list.add(c);


    }
    public  List<Customer> getList(String name){
        return list;
    }
}
