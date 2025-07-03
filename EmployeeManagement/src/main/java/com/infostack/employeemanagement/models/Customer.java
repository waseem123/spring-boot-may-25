package com.infostack.employeemanagement.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_gender")
    private String customerGender;
    @Column(name = "customer_city")
    private String customerCity;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerGender, String customerCity) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerCity = customerCity;
    }

    public Customer(String customerName, String customerGender, String customerCity) {
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerCity = customerCity;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }
}
