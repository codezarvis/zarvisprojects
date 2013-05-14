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
@RequestMapping("/forgetPassword")
public class ForgetPasswordController {



	@RequestMapping(method = RequestMethod.GET)

	public String showForgetPassword(AppUserForm appUserForm){
		return "forgetPassword";

	}

	@ResponseBody
	@RequestMapping (method = RequestMethod.POST)
	public  String forgetPassword(@ModelAttribute AppUserForm appUserForm , WebRequest webRequest){

		AppUser appUser = null;
		System.out.println("In changePost");
		AppUserService appUserService = AppUserServiceImpl.getInstance();

		appUser = appUserService.forgotPassword(appUserForm.getUserName(), appUserForm.getSecurityQuestion(), appUserForm.getAnswer());

		String response = null;

		if(appUser == null){
			
			response ="0";
			
			return  response;

		}else{

			webRequest.setAttribute("appUser", appUser, webRequest.SCOPE_SESSION);
			response = appUser.getPassword();
			System.out.println(response);
			response = "1";
			return  response;
		}

	}
}



