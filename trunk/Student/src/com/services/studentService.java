package com.services;

import java.util.List;

import com.domain.Studentinfo;

public interface studentService 
{
	void create(Studentinfo student);
	
	 List<Studentinfo> getAll();

}
