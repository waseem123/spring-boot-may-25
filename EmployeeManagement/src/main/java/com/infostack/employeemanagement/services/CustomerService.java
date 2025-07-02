package com.infostack.employeemanagement.services;

import com.infostack.employeemanagement.models.Customer;
import com.infostack.employeemanagement.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository cr;

    public List<Customer> getAllCustomers() {
        return (List<Customer>) cr.findAll();
    }

    public List<Customer> getAllCustomersSorted() {
        List<Customer> customers =  (List<Customer>) cr.findAll();
        customers.sort((n1,n2)->n1.getCustomerName().compareTo(n2.getCustomerName()));
        return customers;
    }



    public Customer getById(int id) {
        if (cr.findById(id).isPresent())
            return cr.findById(id).get();
        return new Customer();
    }

    public Customer edit(Customer c){
        return cr.save(c);
    }

    public boolean delete(Customer c){
        cr.delete(c);
        return true;
    }
}
