package com.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.model.Dept;
import com.service.DeptDAO;




public class Test {

	public static void main(String[] args) {

		
		try {
			DeptDAO deptDAO = new DeptDAO();
			deptDAO.connect();
			
			List<Dept> list = deptDAO.getAll();
			
			for(Dept dept : list) {
				System.out.println(dept);
			}
			
			
//			Dept dept = new Dept();
			
//			dept.setDname("MCA");
//			dept.setLoc("MUMBAI");
//			dept.setDistance(10.45);
//			dept.setDeptno(40);
//			deptDAO.update(dept);
//			
			
//			int flag = deptDAO.delete(30);
//			
//			if(flag > 0) {
//				System.out.println("Record Delted");
//			}else {
//				System.out.println("Record Not Found");
//			}
//			
			
//			Dept dept = new Dept();
//			dept.setDeptno(12);
//			dept.setDname("CSE");
//			dept.setLoc("VIJ");
//			dept.setDistance(450.25);
//			
//			deptDAO.create(dept);
			
			deptDAO.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
