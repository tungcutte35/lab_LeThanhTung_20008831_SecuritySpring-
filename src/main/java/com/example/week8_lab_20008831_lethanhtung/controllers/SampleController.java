package com.example.week8_lab_20008831_lethanhtung.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    @GetMapping
    public String hello(){
        return "hello world";
    }
}