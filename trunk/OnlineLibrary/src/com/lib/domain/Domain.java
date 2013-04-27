/**
 * 
 */
package com.lib.domain;

/**
 * @author Anusha This Class Provides Common fields for Application Objects
 * 
 */
public abstract class Domain {

	private int id;
	private int acive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAcive() {
		return acive;
	}

	public void setAcive(int acive) {
		this.acive = acive;
	}

}
