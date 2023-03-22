package com.useroperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentLogin {
	
	public static void studentLogin(String username,String password ) {
		try {
		Connection connection=CommonConnection.getConnectionObj();
		
		PreparedStatement ps = connection.prepareStatement("select * from Student ");		    
	 
		   ResultSet resultSet = ps.executeQuery();
		   
		   while(resultSet.next()) {
			   if((username.equals(resultSet.getString(4))) && (password.equals(resultSet.getString(5)))) {
				   System.out.println("...welcome...");
				   System.out.println("Lets Start The Quiz");
				  
				   Quiz.quizQuestions(username);

			   }
			   
			   else {
				   System.out.println("Invalid Username or Password");

			   }

			 			
		   }
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

	}
	
	   
  }
