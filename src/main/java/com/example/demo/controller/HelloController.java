package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api/v1")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "<h1>hello el-hathat mohamed</h1> </br> <a href='https://el-hathat.github.io/MyPortfolio/'><h1>My portfolio</h1></a>";
    }
}
