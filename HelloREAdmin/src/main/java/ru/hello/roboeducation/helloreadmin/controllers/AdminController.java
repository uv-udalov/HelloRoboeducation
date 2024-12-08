package ru.hello.roboeducation.helloreadmin.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String findAll() {
        return "HelloREAdmin";
    }

//    @PostMapping
//    @
//    public String addNewUser() {
//
//        return "OK";
//    }

}
