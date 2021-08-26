package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE_TABLE_JAVA")
public class Employee {

    @Id // primary key unique value
    @GeneratedValue // Automatically increment current 1,2,3,......14,15
            Long id;

    String name;
    int age;
    String dept;


    // default constructor
    public Employee() {

    }
    // parameterized constructor


    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
