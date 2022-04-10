package com.springdemo.springproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"name", "phone"})

public class FilterBean {

    private String name;
    @JsonIgnore
    private  Integer salary;
    private String phone;


    public FilterBean(String name, Integer salary, String phone) {
        super();
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
