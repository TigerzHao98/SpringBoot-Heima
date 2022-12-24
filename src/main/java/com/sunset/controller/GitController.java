package com.sunset.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitController {

    @GetMapping
    public String getById(){
        System.out.println("this is a git demo,welcome learn idea and Git");
        System.out.println("Git version 2");
        return "this is a git demo,welcome learn idea and Git";

    }

}