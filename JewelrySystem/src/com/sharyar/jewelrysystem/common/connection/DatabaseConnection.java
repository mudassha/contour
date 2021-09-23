package com.sharyar.jewelrysystem.common.connection;

import java.sql.*;

public class DatabaseConnection {

	private static DatabaseConnection instance = new DatabaseConnection();
	
	private Connection connect;
	
	
	private DatabaseConnection() {
		try
		{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/jewelrystoredatabase","root","1234");  
			connect = con;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static DatabaseConnection getInstance() {
		return instance;
	}
	
	public Connection returnConnection() {
		
		
		return connect;
	}
}
