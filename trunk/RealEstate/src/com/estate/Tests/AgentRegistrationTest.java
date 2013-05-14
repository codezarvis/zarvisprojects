package com.estate.tests;

import java.io.IOException;

import com.estate.controllers.AgentController;
import com.estate.views.AgentRegistration;

public class AgentRegistrationTest {

	public static void main(String[] args) throws IOException {

		AgentRegistration agentRegistration = new AgentRegistration();
		AgentController agentController = new AgentController(agentRegistration);
		agentController.controller();
		
	}

}
