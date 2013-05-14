package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.sa.domain.sub.AppUser;
import com.sa.service.AppUserService;
import com.sa.service.impl.AppUserServiceImpl;
import com.web.forms.AppUserForm;


@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)

	public String showLogin(AppUserForm appUserForm){
		return "login";

	}


	@ResponseBody
	@RequestMapping (method = RequestMethod.POST)
	public  String showUserHome(@ModelAttribute AppUserForm appUserForm , WebRequest webRequest){


		System.out.println("In Post");
		AppUserService appUserService = AppUserServiceImpl.getInstance();

		AppUser appUser = appUserService.authenticate(appUserForm.getUserName(), appUserForm.getPassword());
		String response = null;
		if(appUser == null){
			return  response;

		}else{
			
			webRequest.setAttribute("appUser", appUser, webRequest.SCOPE_SESSION);
			response = appUser.getUserRole();

			System.out.println(response);

			return  response;
		}

	}

}
