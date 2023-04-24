package com.crud.employee.service;

import java.util.List;

import com.crud.employee.entity.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	Employee getEmployeeById(Long employeeId);
	
	List<Employee> getAllEmployees();
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployee(Long employeeId);

}
