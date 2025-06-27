package com.infostack.employeemanagement.controllers;

import com.infostack.employeemanagement.repositories.EmployeeRepository;
import com.infostack.employeemanagement.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository er;
    List<Employee> empList = new ArrayList<>();

    public EmployeeController() {
        Employee e1 = new Employee(1, "John", "London", 25000);
        Employee e2 = new Employee(2, "Peter", "New York", 250000);
        Employee e3 = new Employee(3, "Sam", "LA", 50000);
        Employee e4 = new Employee(4, "Razor", "San Fransisco", 25000);
        Employee e5 = new Employee(5, "Blade", "Berlin", 50000);
        Employee e6 = new Employee();
        e6.setEmpId(6);
        e6.setEmpName("Johnson");
        e6.setEmpCity("Bejeing");
        e6.setEmpSalary(65000);
        e6.setEmpDesignation("Project Manager");

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
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
        } catch (Exception ex) {
            return e;
        }
    }

    @RequestMapping("/employee/save")
    public Employee saveEmployeeData() {
        Employee e1 = new Employee();
        e1.setEmpName("Peter");
        e1.setEmpCity("New York");
        e1.setEmpSalary(250000);
        e1.setEmpDesignation("General Manager");
        return er.save(e1);
    }

    @RequestMapping("employee/all-employees")
    public List<Employee> allEmployees() {
        return (List<Employee>) er.findAll();
    }

    @RequestMapping("employee/addall")
    public List<Employee> addAll(){
        List<Employee> employees = new ArrayList<>();
        Employee e3 = new Employee("Sam", "LA", 50000);
        Employee e4 = new Employee("Razor", "San Fransisco", 25000);
        Employee e5 = new Employee("Blade", "Berlin", 50000);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        return (List<Employee>)er.saveAll(employees);
    }
    @RequestMapping("employee/changedata")
    public Employee changeData() {
        Employee e = new Employee();
        e.setEmpId(3);
        e.setEmpName("Sam");
        e.setEmpSalary(50000);
        e.setEmpDesignation("Sr. Engineer");
        return er.save(e);
    }

    @RequestMapping("employee/fetch/{id}")
    public Employee fetchById(@PathVariable("id") int empId) {
        try{
            return er.findById(empId).get();
        }catch (NoSuchElementException ex){
            return new Employee();
        }
    }

}
