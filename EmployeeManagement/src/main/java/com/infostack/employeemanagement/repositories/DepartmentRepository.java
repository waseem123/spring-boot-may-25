package com.infostack.employeemanagement.repositories;

import com.infostack.employeemanagement.models.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
