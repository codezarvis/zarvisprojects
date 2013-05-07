package com.tests;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FrontController controller = new FrontController();
		controller.dispatchRequest("EMPLOYEE");
		
		controller.dispatchRequest("MANAGER");

	}

}
