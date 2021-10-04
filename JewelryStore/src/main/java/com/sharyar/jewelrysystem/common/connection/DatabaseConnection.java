package com.sharyar.jewelrysystem.common.connection;

import java.sql.*;


public class DatabaseConnection {

	private static DatabaseConnection instance = new DatabaseConnection();
	
	private Connection connect;
	
	
	private DatabaseConnection() {
		
	}
	
	public static DatabaseConnection getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		
		
		if(connect == null)
		{	
				//Class.forName("");
				connect = DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/jewelrystoredatabase","root","1234");  
				
		}
		
		
		return connect;
	}
}

//use finalize for garbage collection to close connection
