package com.demo.controller;

import com.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpControllerWithRequestBody {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    // add, get_all , update, delete

    //ADD ENDPOINT
    @RequestMapping("/add_emp_new")
    public String addEmployee(@RequestBody Employee employee){

        employeeArrayList.add(employee);
        return "Employee Added Successfully....";
    }

    //get_all ENDPOINT
    @RequestMapping("/get_all_emp_new")
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    //update ENDPOINT
    @RequestMapping("/update_emp_new")
    public String updateEmployee(){

        Employee employee1= employeeArrayList.get(0);
        employee1.setName("Java");// setter method to update name

        return  employeeArrayList.get(0).getName() + " Record updated successfully ..";
    }

    //delete ENDPOINT
    @RequestMapping("/delete_emp_new")
    public String removeEmployee(){
        employeeArrayList.remove(0);

        return "Employee deleted Successfully .....";

}
}
