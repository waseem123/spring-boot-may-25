package com.infostack.employeemanagement.repositories;

import com.infostack.employeemanagement.dtos.EmployeeDTO;
import com.infostack.employeemanagement.models.Department;
import com.infostack.employeemanagement.models.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findByDepartment(Department dept);
    List<Employee> findByDepartmentDeptName(String deptName);
    List<Employee> findByDepartmentDeptId(int deptId);

    @Query("select new com.infostack.employeemanagement.dtos.EmployeeDTO(empId,empName,empCity) from Employee e where e.empId = ?1")
    EmployeeDTO findByEmpId(int empId);


}