package com.estate.tests;

import java.io.IOException;

import com.estate.controllers.AgentLoginController;
import com.estate.views.AgentLogin;

public class ALoginTest {

	public static void main(String[] args) throws IOException {
		AgentLogin agentLogin = new AgentLogin();
		AgentLoginController agentLoginController = new AgentLoginController(agentLogin);
		agentLoginController.controller();
	}
}
