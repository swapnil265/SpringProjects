package com.swapnil.full.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //defines two thing it is controller and return a response body and also a component
public class HelloController {

    //defines the end point and the type of method
    //@RequestMapping(value ="/" , method = RequestMethod.GET)

    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to Swapnil rest API 222 ";
    }
}