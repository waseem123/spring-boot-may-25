package com.infostack.employeemanagement.controllers;

import com.infostack.employeemanagement.models.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    List<Employee> empList = new ArrayList<>();

    public EmployeeController() {
        Employee e1 = new Employee(1, "John", "London", 25000);
        Employee e2 = new Employee(2, "Peter", "New York", 250000);
        Employee e3 = new Employee(3, "Sam", "LA", 50000);
        Employee e4 = new Employee(4, "Razor", "San Fransisco", 25000);
        Employee e5 = new Employee(5, "Blade", "Berlin", 50000);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
    }


    @RequestMapping("/employee")
    public Employee getEmployee() {
        Employee e = new Employee(101, "Alexandar", "Solapur", 50000);
        return e;
    }

    @RequestMapping("/employee/all")
    public List<Employee> getAllEmployees() {
        return empList;
    }

    @RequestMapping("/employee/view/{id}")
    public Employee getById(@PathVariable("id") int empid) {
        Employee e = new Employee();
        try {
            e = empList.get(empid - 1);
            return e;
        }catch (Exception ex) {
            return e;
        }
    }

}
