package com.crud.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
