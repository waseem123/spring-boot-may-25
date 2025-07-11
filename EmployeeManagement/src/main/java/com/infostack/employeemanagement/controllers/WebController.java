package com.infostack.employeemanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {
    @RequestMapping("/")
    public String homePage(Model m){
        m.addAttribute("fullName","Waseem Attar");
        m.addAttribute("firstNumber",180);
        m.addAttribute("secondNumber",10);
        return "homepage";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }
}
