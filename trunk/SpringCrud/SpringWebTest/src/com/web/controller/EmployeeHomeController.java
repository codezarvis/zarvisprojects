package com.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.domain.Employee;
import com.domain.impl.EmployeeImpl;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import com.web.forms.EmployeeForm;

@Controller
@RequestMapping("/employeeHome")
public class EmployeeHomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String showEmployeeEntryForm(
			@ModelAttribute EmployeeForm employeeForm) {
		return "employeeEntry";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = {"id"})
	public String deleteEmployee(Integer id, WebRequest request) {
		System.out.println(id+2);
		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		employeeService.delete(id);

		List<Employee> employeeList = employeeService.getAll();
		request.setAttribute("employeeList", employeeList,
				WebRequest.SCOPE_REQUEST);

		
		return "employeeGrid";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String postForm(@ModelAttribute EmployeeForm employeeForm,
			WebRequest request) {

		Employee employee = new EmployeeImpl();
		employee.setId(employeeForm.getId());
		employee.setName(employeeForm.getName());
		employee.setSalary(employeeForm.getSalary());

		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		employeeService.create(employee);

		List<Employee> employeeList = employeeService.getAll();
		request.setAttribute("employeeList", employeeList,
				WebRequest.SCOPE_REQUEST);

		return "employeeGrid";
	}

}
