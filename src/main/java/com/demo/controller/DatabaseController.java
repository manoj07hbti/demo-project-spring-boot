package com.demo.controller;


import com.demo.model.Employee;

import com.demo.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class DatabaseController {
    //Class_Name  var_name;
    @Autowired
    EmployeeJpaRepository employeeJpaRepository;// Spring way of creating object


    @RequestMapping(value = "/all", method = RequestMethod.GET)

    public List<Employee> getAllEmployee() {
        return employeeJpaRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeJpaRepository.save(employee);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Employee findEmployee(@RequestBody Employee employee) {
        return employeeJpaRepository.save(employee);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void removeEmployee(@RequestParam Long id) {


        employeeJpaRepository.deleteById(id);

    }


    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    public Optional<Employee> findEmployee(@RequestParam Long id) {
        return employeeJpaRepository.findById(id);
    }





}
