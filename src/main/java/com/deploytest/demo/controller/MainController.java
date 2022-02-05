package com.deploytest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class MainController {

    @GetMapping("")
    public String initialLoad(){
        return "Hello AWS!";
    }

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String word){
        return "Hello "+word;
    }
}
