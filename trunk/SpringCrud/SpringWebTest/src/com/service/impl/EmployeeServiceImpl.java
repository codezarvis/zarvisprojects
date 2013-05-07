package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.domain.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private static List<Employee> employeeList = new ArrayList<Employee>();

	private static EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

	public static EmployeeService getInstance() {
		return employeeServiceImpl;
	}

	private EmployeeServiceImpl() {

	}

	@Override
	public void create(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public List<Employee> getAll() {
		return employeeList;
	}

	@Override
	public void delete(Integer id) {

		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			System.out.println(employee);
			if (employee.getId() == id) {
				System.out.println("Ok");
				employeeList.remove(i);
			}
		}

	}

	@Override
	public void update(Employee employee) {
		// TO DO
	}

}
