package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sayhello {
    @Value("${person.name}")
    private String name;
    public String Sayhello(){
        return "hello"+name;
    }
}
