package com.crud.employee.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import lombok.AllArgsConstructor;
import com.crud.employee.entity.Employee;
import com.crud.employee.repository.EmployeeRepository;
import com.crud.employee.service.EmployeeService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long employeeId) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
		return optionalEmployee.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = employeeRepository.findById(employee.getId()).get();
		existingEmployee.setName(employee.getName());
		existingEmployee.setLast_name(employee.getLast_name());
		existingEmployee.setPosition(employee.getPosition());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setEmail(employee.getEmail());
		
		Employee updateEmployee = employeeRepository.save(existingEmployee);
		return updateEmployee;
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
