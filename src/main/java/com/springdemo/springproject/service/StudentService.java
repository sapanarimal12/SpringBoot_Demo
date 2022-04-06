package com.springdemo.springproject.service;

import com.springdemo.springproject.model.Student;

import java.util.List;

public interface StudentService {
    public  Integer saveStudent(Student Student );

    public List<Student> getAllStudents();

    public  Student getStudentById(Integer id);
    public void  deleteStudent(Integer id);

}
