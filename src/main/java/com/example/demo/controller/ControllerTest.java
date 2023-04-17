package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

   @GetMapping("/say")
    public String say(){

    return "hello world";
    }

}
