package com.library.library_managment.controller;


import com.library.library_managment.model.Admin;
import com.library.library_managment.model.Book;
import com.library.library_managment.repository.AdminRepository;
import com.library.library_managment.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class AdminController {
    private AdminRepository adminRepository;

    public List<Admin> getallAdmin(){
        return adminRepository.findAll();
    }


}
