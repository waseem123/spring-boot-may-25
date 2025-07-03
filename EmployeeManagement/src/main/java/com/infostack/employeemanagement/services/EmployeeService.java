package com.infostack.employeemanagement.services;

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

    public List<Employee> deptWiseEmployees(Department d){

    }
}
