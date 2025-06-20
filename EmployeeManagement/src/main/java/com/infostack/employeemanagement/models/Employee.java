/*
* Author: Waseem Attar
* Date  : 20-06-2025
* Name  : Employee
* */

package com.infostack.employeemanagement.models;


public class Employee {
    int empId;
    String empName;
    String empCity;
    int empSalary;

    public Employee() {
    }

    public Employee(int empId, String empName, String empCity, int empSalary) {
        this.empSalary = empSalary;
        this.empCity = empCity;
        this.empName = empName;
        this.empId = empId;
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
}
