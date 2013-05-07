package com.tests;

public class Dispatcher {

	EmployeeView employeeView;
	ManagerView managerView;	
	
	public Dispatcher() {
		employeeView = new EmployeeView();
		managerView = new ManagerView();
	}
	
	public void dispatch(String request) {
		
		if(request.equals("EMPLOYEE")) {
			employeeView.display();
		}else {
			managerView.display();
		}		
	}
	
	
}
