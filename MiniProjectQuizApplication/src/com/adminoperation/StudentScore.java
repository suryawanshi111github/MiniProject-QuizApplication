package com.adminoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.useroperation.CommonConnection;

public class StudentScore {

	public static void getStudentScore(String username ) {
		try {
			Connection connection=CommonConnection.getConnectionObj();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM resulttable where username =? ");
			     ps.setString(1,username);
			
			ResultSet resultSet = ps.executeQuery();
			   while(resultSet.next()) {
				   System.out.println("Student score is >>"+resultSet.getInt(2));
			   }
			   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
        public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter Username to get user Score");
        	String username=scanner.next();
        	
        	
        	getStudentScore( username );
			
		}

}
