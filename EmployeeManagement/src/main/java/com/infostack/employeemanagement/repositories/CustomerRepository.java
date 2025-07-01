package com.infostack.employeemanagement.repositories;

import com.infostack.employeemanagement.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
