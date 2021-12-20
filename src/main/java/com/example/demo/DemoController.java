package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    public String hello(){
        return "Welcome to Milestone. This is Group 03";
    }
}
