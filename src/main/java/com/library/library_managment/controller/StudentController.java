package com.library.library_managment.controller;

import com.library.library_managment.model.Book;
import com.library.library_managment.model.Student;
import com.library.library_managment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    //get all
    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    //add
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }


}
