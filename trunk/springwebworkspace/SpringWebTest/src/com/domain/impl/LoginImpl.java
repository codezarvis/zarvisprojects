package com.domain.impl;

import com.domain.Login;


public class LoginImpl implements Login{
	
	private String userName;
	private String password;
	/* (non-Javadoc)
	 * @see com.domain.impl.Login#getUserName()
	 */
	@Override
	public String getUserName() {
		return userName;
	}
	/* (non-Javadoc)
	 * @see com.domain.impl.Login#setUserName(java.lang.String)
	 */
	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/* (non-Javadoc)
	 * @see com.domain.impl.Login#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/* (non-Javadoc)
	 * @see com.domain.impl.Login#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}