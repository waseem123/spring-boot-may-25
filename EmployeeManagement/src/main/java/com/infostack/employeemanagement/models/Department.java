package com.infostack.employeemanagement.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int deptId;
    String deptName;
    String deptBuilding;

    public Department(int deptId, String deptName, String deptBuilding) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptBuilding = deptBuilding;
    }

    public Department() {
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptBuilding() {
        return deptBuilding;
    }

    public void setDeptBuilding(String deptBuilding) {
        this.deptBuilding = deptBuilding;
    }
}