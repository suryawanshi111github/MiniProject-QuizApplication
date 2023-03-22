package com.useroperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class StudentRegistration {
	public static void insertStudentRecord(String firstname,String lastname,String username, String password, String city,String emailid,long mobilenumber) {
                   
                   try {
					Connection connection = CommonConnection.getConnectionObj();
					PreparedStatement ps = connection.prepareStatement("insert into Student(firstname,lastname,username,password,city,emailid,mobilenumber) values(?,?,?,?,?,?,?)");
                    ps.setString(1,firstname);
                    ps.setString(2,lastname);
                    ps.setString(3,username);
                    ps.setString(4,password);
                    ps.setString(5,city);
                    ps.setString(6,emailid);
                    ps.setLong  (7,mobilenumber);
                    ps.execute();
                    System.out.println("Student Registration Successfully Done");
                    
                    TestMain.doLogin();
                    
                                      
                          

				} catch (SQLException e) {
					e.printStackTrace();
				}
	} 
	       
	        
		
}
