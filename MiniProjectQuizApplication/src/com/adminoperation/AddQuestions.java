package com.adminoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.useroperation.CommonConnection;

public class AddQuestions {
	static void addQuetions( String Question, String A, String B, String C, String D, String Result) {

		try {
			Connection connection = CommonConnection.getConnectionObj();

			PreparedStatement ps = connection.prepareStatement("insert into Quiz(Question,A,B,C,D,Result) values (?,?,?,?,?,?)");
			ps.setString(1, Question);
			ps.setString(2, A);
			ps.setString(3, B);
			ps.setString(4, C);
			ps.setString(5, D);
			ps.setString(6, Result);
			ps.execute();
			System.out.println("Quetion inserted successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void adminInput() {
		
	
		      Scanner scanner = new Scanner(System.in);
		      
		       

				System.out.println("Please enter your Question");
				String Question = scanner.nextLine();
				
				System.out.println("Please enter 1st option");
				String A = scanner.nextLine();

				System.out.println("Please enter 2nd option");
				String B = scanner.nextLine();

				System.out.println("Please enter 3nd option");
				String C = scanner.nextLine();

				System.out.println("Please enter 4th option");
				String D = scanner.nextLine();

				System.out.println("Please enter answer");
				String Result = scanner.nextLine();

				AddQuestions.addQuetions(Question,A,B,C,D,Result);

		       
		
		}

}
		



