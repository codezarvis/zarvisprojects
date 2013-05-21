package com.domain;


public class Studentinfo
{
private int sno;
private String sname;
private int s1;
private int s2;
private int total;

public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getS1() {
	return s1;
}
public void setS1(int s1) {
	this.s1 = s1;
}
public int getS2() {
	return s2;
}
public void setS2(int s2) {
	this.s2 = s2;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total =(total=s1+s2);
}





}
