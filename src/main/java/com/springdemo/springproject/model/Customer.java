package com.springdemo.springproject.model;

//import javax.persistence.*;

import javax.persistence.*;

@Entity
public class Customer {



         @Id
         @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "ID")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private  Long age;

    @Column(name = "location")
    private  String location;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
