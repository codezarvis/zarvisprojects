package com.tests;

public class FrontController {

	Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	public void dispatchRequest(String request) {

		dispatcher.dispatch(request);
	}

}
