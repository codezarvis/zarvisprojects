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
@RequestMapping("/changePassword")
public class ChangePasswordController {
	
	
	@RequestMapping(method = RequestMethod.GET)

	public String showChangePassword(AppUserForm appUserForm){
		return "changePassword";

	}
	
	@ResponseBody
	@RequestMapping (method = RequestMethod.POST)
	public  String changePassword(@ModelAttribute AppUserForm appUserForm , WebRequest webRequest){

		int i =0;
		System.out.println("In changePost");
		AppUserService appUserService = AppUserServiceImpl.getInstance();

		i = appUserService.changePassword(appUserForm.getUserName(), appUserForm.getPassword(), appUserForm.getAnswer());
		
		System.out.println("i value"+ i);
		
		String response = null;
		
		if(i == 0){
			
			response = "0";
			return  response;

		}else{
			
			response = "1";
			return  response;
		}
	}


}
