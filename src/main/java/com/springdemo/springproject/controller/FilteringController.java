package com.springdemo.springproject.controller;

import com.springdemo.springproject.model.FilterBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @RequestMapping("/filtering")
    public FilterBean retrieveSomeBean()
    {
        return new FilterBean("Amit", 500000,"9845627684");
    }
    //returning a list of SomeBeans as response
    @RequestMapping("/filtering-list")
    public List<FilterBean> retrieveListOfSomeBeans()
    {
        return Arrays.asList(new FilterBean("Saurabh", 700000,"9845224467"),
                new FilterBean("Devesh", 900000,"9835887754"));
    }
}
