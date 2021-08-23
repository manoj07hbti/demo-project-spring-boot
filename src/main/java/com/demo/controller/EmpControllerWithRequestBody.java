package com.demo.controller;

import com.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpControllerWithRequestBody {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    // add, get_all , update, delete

    //ADD ENDPOINT
    //value = "/all", method = RequestMethod.GET
    @RequestMapping(value ="/add_emp_new", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){

        employeeArrayList.add(employee);
        return "Employee Added Successfully....";
    }

    //get_all ENDPOINT
    @RequestMapping(value = "/get_all_emp_new" , method = RequestMethod.GET)
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    //update ENDPOINT
    @RequestMapping(value = "/update_emp_new", method = RequestMethod.PUT)
    public String updateEmployee(){

        Employee employee1= employeeArrayList.get(0);
        employee1.setName("Java");// setter method to update name

        return  employeeArrayList.get(0).getName() + " Record updated successfully ..";
    }

    //delete ENDPOINT
    @RequestMapping(value="/delete_emp_new", method = RequestMethod.DELETE)
    public String removeEmployee(){
        employeeArrayList.remove(0);

        return "Employee deleted Successfully .....";

}
}
