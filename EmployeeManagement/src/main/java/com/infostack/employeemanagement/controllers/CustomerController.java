package com.infostack.employeemanagement.controllers;


import com.infostack.employeemanagement.models.Customer;
import com.infostack.employeemanagement.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService cs;

    @RequestMapping("")
    public List<Customer> getCustomers() {
        return cs.getAllCustomers();
    }

    @RequestMapping("/sorted")
    public List<Customer> getSortedCustomers() {
        return cs.getAllCustomersSorted();
    }

    @RequestMapping("/save")
    public Customer saveCustomer(@RequestBody Customer c) {
        return cs.edit(c);
    }
}
