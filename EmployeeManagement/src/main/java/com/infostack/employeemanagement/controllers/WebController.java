package com.infostack.employeemanagement.controllers;

import com.infostack.employeemanagement.dtos.EmployeeDTO;
import com.infostack.employeemanagement.models.Employee;
import com.infostack.employeemanagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/web")
public class WebController {
    @Autowired
    EmployeeService es;

    @RequestMapping("/")
    public String homePage(Model m) {
        m.addAttribute("fullName", "Waseem Attar");
        m.addAttribute("firstNumber", 180);
        m.addAttribute("secondNumber", 10);
        m.addAttribute("pageTitle", "Home");
        return "homepage";
    }

    @RequestMapping("/about")
    public String aboutPage(Model m) {
        m.addAttribute("pageTitle", "About");
        return "about";
    }

    @RequestMapping("/emp/{empId}")
    public String empData(@PathVariable("empId") int empId,
                          Model m) {
        try {
            Employee e = es.getById(empId);
            System.out.println(e.toString());
            m.addAttribute("pageTitle", "EMPLOYEE");
            m.addAttribute("employee", e);
        } catch (Exception e) {
            m.addAttribute("employee", new Employee());
        }
        return "employee";
    }

    @RequestMapping("/emp/all")
    public String allEmployees(Model m) {
        List<Employee> employeeList = es.findAllEmployees();
        m.addAttribute("employeeList", employeeList);
        return "all-employees";
    }
}
