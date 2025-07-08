/*
 * Author: Waseem Attar
 * Date  : 20-06-2025
 * Name  : Employee
 * */

package com.infostack.employeemanagement.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int empId;
    String empName;
    String empCity;
    int empSalary;
    String empDesignation;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    Department department;

    public Employee() {
    }
    public Employee(int empId, String empName, String empCity) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
    }
    public Employee(int empId, String empName, String empCity, int empSalary) {
        this.empSalary = empSalary;
        this.empCity = empCity;
        this.empName = empName;
        this.empId = empId;
    }

    public Employee(int empId, String empName, String empCity, int empSalary, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
    }

    public Employee(String empName, String empCity, int empSalary) {
        this.empName = empName;
        this.empCity = empCity;
        this.empSalary = empSalary;
    }

    public Employee(int empId, String empName, String empCity, int empSalary, String empDesignation, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
        this.department = department;
    }

    public Employee(String empName, String empCity, int empSalary, String empDesignation, Department department) {
        this.empName = empName;
        this.empCity = empCity;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", empSalary=" + empSalary +
                ", empDesignation='" + empDesignation + '\'' +
                ", department=" + department +
                '}';
    }
}
