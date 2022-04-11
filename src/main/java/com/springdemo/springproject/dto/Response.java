package com.springdemo.springproject.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
public class Response implements Serializable {


    private  Boolean success;
    private String message;
    private Object data;
}
