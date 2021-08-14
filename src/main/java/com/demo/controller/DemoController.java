package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    //END POINT 1
    @RequestMapping("/welcome")
    public void hello(){

        System.out.println("Hello, Welcome to Spring Boot...");
    }

    //END POINT 2
    @RequestMapping("/welcome_screen")
    public String hello_screen(){

       return  "Hello, Welcome to Spring Boot...";
    }

    //END POINT 3
    @RequestMapping("/age")
    public int age(){

        return  33;
    }

    //ENDPOINT 4

    @RequestMapping("/names")
    public List<String>  listofNames(){

        ArrayList <String> name= new ArrayList<>();

        name.add("Raj");
        name.add("Rahul");
        name.add("Java");
        name.add("Spring");
        name.add("Spring Boot");

        return name;
    }



}
