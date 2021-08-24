package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody  将数据直接写入响应体  如果是对象则直接转换为json数据格式
@RestController //相当于以上两个注解
public class Hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
        return "HELLO WORLD";
    }
}
