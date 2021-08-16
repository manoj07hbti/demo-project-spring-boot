package com.demo.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

// PATH VARIABLE

    @RequestMapping("/hello/{msg}")
    public String message(@PathVariable String msg){

        return "Welcome "+ msg;
    }

    @RequestMapping("/addition/{a}/{b}")
    public int addwithPathVariable(@PathVariable int a, @PathVariable int b ){

        int sum=a+b;

        return sum;
    }


// Request param

    @RequestMapping("/hello")
    public String messageRequestParam(@RequestParam String msg){

        return "Welcome "+ msg;
    }

    @RequestMapping("/add")
    public int addwithRequestParam(@RequestParam int a, @RequestParam int b ){

        int sum=a+b;

        return sum;
    }


}
