package com.estate.domain;

import java.util.List;

public class Portfolio {

	private String pid;
	private String propertyType;
	private String propertyCategory;
	private List<Address> addressList;
	private String areaSize;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyCategory() {
		return propertyCategory;
	}
	public void setPropertyCategory(String propertyCategory) {
		this.propertyCategory = propertyCategory;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public String getAreaSize() {
		return areaSize;
	}
	public void setAreaSize(String areaSize) {
		this.areaSize = areaSize;
	}
	
	
}
