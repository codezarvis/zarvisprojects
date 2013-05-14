/**
 * 
 */
package com.sa.service;

import java.util.List;

import com.sa.domain.sub.AppUser;

/**
 * @author Jitesh
 *
 */
public interface AppUserService {

	void create(AppUser appUser);

	List<AppUser> getAll();

	AppUser authenticate(String userName, String password);

	AppUser forgotPassword(String userName,String securityQuestion, String answer);
	
	int changePassword(String userName,String password,String answer);

	AppUser findByUserName(String userName);


}
