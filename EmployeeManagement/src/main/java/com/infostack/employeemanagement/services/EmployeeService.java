package com.infostack.employeemanagement.services;

import com.infostack.employeemanagement.dtos.EmployeeDTO;
import com.infostack.employeemanagement.models.Department;
import com.infostack.employeemanagement.models.Employee;
import com.infostack.employeemanagement.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository er;

    public Employee saveData(Employee e){
        return er.save(e);
    }

    public List<Employee> findByDepartment(Department dept) {
        return er.findByDepartment(dept);
    }

    public List<Employee> findByDepartmentName(String deptName) {
        return er.findByDepartmentDeptName(deptName);
    }
    public List<Employee> findByDepartmentDeptID(int deptId){
        return er.findByDepartmentDeptId(deptId);
    }

    public EmployeeDTO findByEmpId(int empId) {
        return er.findByEmpId(empId);
    }
}
