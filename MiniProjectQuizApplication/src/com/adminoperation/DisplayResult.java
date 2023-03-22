package com.adminoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.useroperation.CommonConnection;

public class DisplayResult {
	
	public static void main(String[] args) {
		
	
		 
		try {
			Connection connection=CommonConnection.getConnectionObj();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM resultTable ORDER BY Result asc ");
			   ResultSet resultSet = ps.executeQuery();
			   while(resultSet.next()) {
				   System.out.println("Result in ascending order"+resultSet.getInt(2)); 
			   } 
			   
			   
		} catch (SQLException e) {
			e.printStackTrace();
		}

			
	}

	
	}


