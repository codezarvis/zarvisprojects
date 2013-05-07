package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.forms.LoginForm;

@Controller
@RequestMapping("/submit")
public class SubmitController {

	@RequestMapping(method = RequestMethod.POST)
	public String doPost(@ModelAttribute LoginForm loginForm) {

		System.out.println("In Do Post : " + loginForm);
		return "";
	}
}
