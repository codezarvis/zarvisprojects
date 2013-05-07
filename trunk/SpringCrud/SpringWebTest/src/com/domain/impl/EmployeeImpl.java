package com.domain.impl;

import com.domain.Employee;

public class EmployeeImpl implements Employee {

	private int id;
	private String name;
	private Double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeImpl [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	

}
