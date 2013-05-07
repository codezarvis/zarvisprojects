package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.domain.Login;
import com.domain.impl.LoginImpl;
import com.web.forms.LoginForm;

@Controller
@RequestMapping("/login")
public class JiteshController {

	@RequestMapping(method = RequestMethod.GET)
	public String showLogin(@ModelAttribute LoginForm loginForm) {
		return "anusha";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String postJiteshForm(@ModelAttribute LoginForm loginForm, WebRequest request) {
		System.out.println("The Data : "+loginForm);
	
		Login login = new LoginImpl();
		login.setUserName(loginForm.getUserName());
		login.setPassword(loginForm.getPassword());
		
		request.setAttribute("login", login, WebRequest.SCOPE_REQUEST);
		return "viewData";
	}
	
	
}
