package com.infostack.employeemanagement.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @RequestMapping("/")
    public String homepage() {
        return "Welcome to Home Page";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "This is About Page";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        return "This is Services Page";
    }

    @RequestMapping("/contact")
    public String contactPage() {
        return "This is Contact Us Page";
    }

    @RequestMapping("/employee/details/{id}")
    public String employeeDetailsPage(@PathVariable("id") int id) {
        String[] employees = {
                "Sahil",
                "Peerahmed",
                "Mazin",
                "Manisha",
                "Supriya",
                "Rajashree",
                "Rumaiza",
                "Rajni",
                "Kamal",
                "Shaheen"};
        try {
            return "EMPLOYEE NAME - " + employees[id];
        }catch (ArrayIndexOutOfBoundsException ex){
            return "EMPLOYEE DOES NOT EXIST";
        }
    }

    @PostMapping("/addition")
    public String add(@RequestParam("fnum") int fnum,
                      @RequestParam("snum") int snum){
        int addition = fnum + snum;
        return "Addition is - "+addition;
    }
}
