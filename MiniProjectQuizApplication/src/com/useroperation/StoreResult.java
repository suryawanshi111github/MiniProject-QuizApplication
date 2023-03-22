package com.useroperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreResult {
	public static void storeresult(String username, int result) {

		try {
			Connection connection = CommonConnection.getConnectionObj();

			PreparedStatement pst2 = connection.prepareStatement (" insert into resultTable(username,result) values (?,?) ");
			
			pst2.setString(1, username);
			pst2.setInt(2, result);
			
			pst2.execute();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}



