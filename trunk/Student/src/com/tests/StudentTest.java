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
					student.setSno(1);
					student.setSname("anu");
					student.setS1(10);
					student.setS2(20);
					student.setTotal(10+20);
					StudentImpl impl = new StudentImpl();
					impl.create(student);
					
		   
//					statement.setInt(1, );
//					statement.setString(2, );
//					statement.setInt(3, );
//					statement.setInt(4, );
//					statement.setInt(5, );
//					statement.executeUpdate();
					
//					statement.setInt(1, 102);
//					statement.setString(2, "rani");
//					statement.setInt(3, 60);
//					statement.setInt(4, 50);
//					statement.setInt(5, 60+50);
//					statement.executeUpdate();
//					
//					
//					statement.setInt(1, 103);
//					statement.setString(2, "anu");
//					statement.setInt(3, 50);
//					statement.setInt(4, 40);
//					statement.setInt(5, 50+40);
//					statement.executeUpdate();
//					
//					statement.setInt(1, 104);
//					statement.setString(2, "usha");
//					statement.setInt(3, 60);
//					statement.setInt(4, 50);
//					statement.setInt(5, 60+50);
//					statement.executeUpdate();
//					
//					statement.setInt(1, 105);
//					statement.setString(2, "anisha");
//					statement.setInt(3, 70);
//					statement.setInt(4, 50);
//					statement.setInt(5, 70+50);
//					statement.executeUpdate();
					//connection.close();
			}
					
					
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
			}


	
	
	//insert into marks(s1,s2,total)values(value1,value2,value1+value2);
	
	


