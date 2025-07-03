package com.infostack.employeemanagement.repositories;

import com.infostack.employeemanagement.models.Department;
import com.infostack.employeemanagement.models.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    @Query("SELECT Employee e, Department d ")
    public List<Employee> getByDepartment(Department d);

}
