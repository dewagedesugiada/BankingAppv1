package com.dewasulton.bootcmp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

	static final String DB_URL = "jdbc:mysql://localhost/banking";
	Connection connection = null;
	Statement statement = null ;
	ResultSet resultSet =null ;
	
	public Conn(){
		// TODO Auto-generated method stub
		
		try {
			connection = DriverManager.getConnection(DB_URL, "root", "") ;
		} catch (Exception e) {
			
			System.out.println("The Following error has occured : "+ e.getMessage());
		}
	}
	
	public void Disconnect() {
		try {
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			
			System.out.println("The Following error has occured : "+ e.getMessage());
		}
	
	}
	
	public ResultSet ReadRecords(String sql_query) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql_query);
			return resultSet ;
			
		} catch (Exception e) {
			System.out.println("The Following error has occured : "+ e.getMessage());
		}
		
		return resultSet ;
	}
	
	public void ExecuteSQLStatement(String sql_query) {
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql_query);
			
		} catch (Exception e) {
			System.out.println("The Following error has occured : "+ e.getMessage());
		}
	}
	
}
