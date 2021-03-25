package com.app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.classes.Employee_signC;

public class DBConnection 
{
	 
	
	public static Connection getConnection()
	{
		Connection con=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/leave_management?user=root&password=kartik");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

	
	

}
