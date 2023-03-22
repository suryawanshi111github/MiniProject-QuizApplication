package com.useroperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Quiz {
	
	
	public static void quizQuestions(String username) {
		              int count = 0; 
		
		try {
			Connection connection = CommonConnection.getConnectionObj();
			
			PreparedStatement ps1 = connection.prepareStatement("select*from Quiz");
			
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				System.out.println("question is>>>>" + rs1.getString(2));

				System.out.println("option a is>>>" + rs1.getString(3));
				System.out.println("option b is>>>" + rs1.getString(4));
				System.out.println("option c is>>>" + rs1.getString(5));
				System.out.println("option d is>>>" + rs1.getString(6));
				
			//	System.out.println("Result is>>>" + rs1.getInt(7));

				Scanner sc = new Scanner(System.in);
				System.out.println("plz enter ur answer here>>>>...");
				String answer = sc.next();
				if (answer.equals(rs1.getString(7))) {
					System.out.println("correct");
					
					count++;
		            System.out.println("Your Score is>>>"+count);
		            
				} else {
					System.out.println("wrong");
				}
				System.out.println("Score>>>" +count);
				
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		StoreResult.storeresult(username,count);
		
	}
}
	