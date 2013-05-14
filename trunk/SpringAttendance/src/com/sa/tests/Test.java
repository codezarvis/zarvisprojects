package com.sa.tests;

import com.sa.domain.sub.AppUser;
import com.sa.service.AppUserService;
import com.sa.service.impl.AppUserServiceImpl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//creating
		String password = null;
		
		AppUser  appUser = new AppUser();
		
		/*appUser.setUserName("admin"); 
		password  = appUser.getGuid().substring(0,8);
		appUser.setPassword(password);
		appUser.setUserRole("admin");
		appUser.setSecurityQuestion("What is your SchoolName");
		appUser.setAnswer("answer");
		appUser.setCreatedOn(new java.util.Date());
		appUser.setCreatedBy("admin");
		appUser.setModifiedOn(new java.util.Date());
		appUser.setModifiedBy("admin");
		appUser.setActive(1L);

		AppUserService appUserService = AppUserServiceImpl.getInstance();
		appUserService.create(appUser);*/
		
		
		//update Password
		
		appUser.setUserName("admin");
		appUser.setPassword("aaa");
		appUser.setAnswer("admin");
		
		String userName = appUser.getUserName();
		password = appUser.getPassword();
		String answer = appUser.getAnswer();
		
		AppUserService appUserService = AppUserServiceImpl.getInstance();
		appUserService.changePassword(userName, password, answer);
		
		
		//Forget password
		
		/*appUser.setSecurityQuestion("What is your SchoolName");
		appUser.setAnswer("admin");
		appUser.setUserName("admin");
		
	
		
		String securityQuestion = appUser.getSecurityQuestion();
		String answer = appUser.getAnswer();
		String userName = appUser.getUserName();
		
		AppUserService appUserService = AppUserServiceImpl.getInstance();
		appUser = appUserService.forgotPassword(userName, securityQuestion, answer);
		
		System.out.println(appUser.getPassword());*/
		
		
	}

}
