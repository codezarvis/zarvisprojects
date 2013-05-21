package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.domain.Studentinfo;

public class StudentImpl implements studentService
{

	@Override
	public void create(Studentinfo student){
		Connection connection =null;
		PreparedStatement statement=null;
		try{
	        Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			 statement =  connection.prepareStatement("INSERT INTO MARKS VALUES(?,?,?,?,?)");
			 statement.setInt(1,student.getSno());
			 statement.setString(2, student.getSname());
			 statement.setInt(3, student.getS1());
			 statement.setInt(4, student.getS2());
			 statement.setInt(5, student.getTotal());
			 statement.executeUpdate();
			 statement.close();
			 connection.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public List<Studentinfo> getAll(){
		// TODO Auto-generated method stub
		return null;
	}
	

}
