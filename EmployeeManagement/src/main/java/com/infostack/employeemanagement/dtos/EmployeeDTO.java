package com.infostack.employeemanagement.dtos;

public class EmployeeDTO {
    private int empId;
    private String empName;
    private String empCity;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empId, String empName, String empCity) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
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
}
