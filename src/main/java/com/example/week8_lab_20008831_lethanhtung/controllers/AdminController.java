package com.example.week8_lab_20008831_lethanhtung.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping()
    public String admin(){
        return "this is admin area";
    }
}