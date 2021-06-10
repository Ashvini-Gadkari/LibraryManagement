package com.library.library_managment.controller;

import com.library.library_managment.model.Student;
import com.library.library_managment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    //get all
    @GetMapping("/students")
    public List<Student> getallStudent(){
        return studentRepository.findAll();
    }
}
