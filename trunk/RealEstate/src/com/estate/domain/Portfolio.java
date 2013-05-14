package com.estate.domain;

import java.io.InputStream;

public class Portfolio {
	private	String pId;
	private String propertyType;
	private String propertyCategory;
	private Address address;
	private String areaSize;
	private InputStream sitePic;
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getAreaSize() {
		return areaSize;
	}
	public void setAreaSize(String areaSize) {
		this.areaSize = areaSize;
	}
	public InputStream getSitePic() {
		return sitePic;
	}
	public void setSitePic(InputStream sitePic) {
		this.sitePic = sitePic;
	}		
}
