package com.tests;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.domain.Studentinfo;
import com.services.StudentImpl;



	public class StudentTest extends Studentinfo
	{

			
	public static void main(String[] args)
			
			{
				
					Studentinfo student = new Studentinfo();
					student.setSno(2);
					student.setSname("anu");
					student.setS1(10);
					student.setS2(20);
					student.setTotal(student.getTotal());
					StudentImpl impl = new StudentImpl();
					impl.create(student);
					
		   
				
					Studentinfo student1 = new Studentinfo();
					student1.setSno(3);
					student1.setSname("anusha");
					student1.setS1(30);
					student1.setS2(40);
					student1.setTotal(student.getTotal());
					StudentImpl impl1 = new StudentImpl();
					impl1.create(student1);
					

					Studentinfo student2 = new Studentinfo();
					student2.setSno(4);
					student2.setSname("usha");
					student2.setS1(40);
					student2.setS2(50);
					student2.setTotal(student.getTotal());
					StudentImpl impl2 = new StudentImpl();
					impl2.create(student2);
			}
	}
					
//					
					
//		        catch(ClassNotFoundException exception)
//		        {
//		        exception.printStackTrace();
//			
//		        }
//					 catch(Exception exception)
//				        {
//				        exception.printStackTrace();
//					
//				        }
			


	
	
	//insert into marks(s1,s2,total)values(value1,value2,value1+value2);
	
	


