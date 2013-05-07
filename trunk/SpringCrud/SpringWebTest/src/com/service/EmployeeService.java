package com.service;

import java.util.List;

import com.domain.Employee;

public interface EmployeeService {

	void create(Employee employee);
	
	List<Employee> getAll();
	
	void delete(Integer id);
	
	void update(Employee employee);
}
