package com.sa.domain.sub;

import java.util.UUID;

import com.sa.domain.Domain;

public class AppUser  extends Domain{

	private String userName;
	private String password;
	private String userRole;
	private String securityQuestion;
	private String answer;



	public AppUser(){
	
		setGuid(UUID.randomUUID().toString());
	}
	
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userRole
	 */
	public String getUserRole() {
		return userRole;
	}
	/**
	 * @param userRole the userRole to set
	 */
	
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	/**
	 * @return the securityQuestion
	 */
	
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	
	/**
	 * @param securityQuestion the securityQuestion to set
	 */
	
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	
	/**
	 * @param answer the answer to set
	 */
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AppUser [userName=" + userName + ", password=" + password
				+ ", userRole=" + userRole + ", securityQuestion="
				+ securityQuestion + ", answer=" + answer + "]";
	}


	




}
