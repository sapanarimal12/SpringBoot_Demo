package com.springdemo.springproject.service;

import com.springdemo.springproject.model.Student;
import com.springdemo.springproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Integer saveStudent( Student student) {
        return studentRepository.save(student).getId();
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>)studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);

    }
}
