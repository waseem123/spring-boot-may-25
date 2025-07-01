package com.infostack.employeemanagement.controllers;

import com.infostack.employeemanagement.models.Department;
import com.infostack.employeemanagement.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentRepository dr;

    @RequestMapping("")
    public List<Department> getAllDepartments() {
        return (List<Department>) dr.findAll();
    }

    @RequestMapping("/details/{id}")
    public Department getDepartmentById(@PathVariable("id") int deptId) {
        Department d = new Department();
        try {
            d = dr.findById(deptId).get();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        return d;
    }

    @RequestMapping("/save")
    public Department saveDepartment(@RequestParam("dept_name") String deptName,
                                     @RequestParam("dept_building") String deptBuilding) {

        Department d = new Department();
        d.setDeptName(deptName);
        d.setDeptBuilding(deptBuilding);
        return dr.save(d);
    }

    @RequestMapping("/edit/{id}")
    public Department editDepartment(@PathVariable("id") int deptId,
                                     @RequestParam("deptName") String deptName,
                                     @RequestParam("deptBuilding") String deptBuilding
    ) {
        Department d = dr.findById(deptId).get();
        if(d.getDeptId()==0){
            return new Department();
        }else{
            d.setDeptName(deptName);
            d.setDeptBuilding(deptBuilding);
            return dr.save(d);
        }
    }

    @RequestMapping("/edit")
    public Department editDept(@RequestBody Department d){
        return dr.save(d);
    }

    @RequestMapping("/delete")
    public Department deleteDept(@RequestBody Department d){
        dr.delete(d);
        return d;
    }

}
