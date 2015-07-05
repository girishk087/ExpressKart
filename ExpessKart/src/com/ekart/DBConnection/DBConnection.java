package com.ekart.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection=null;

	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "ebstore");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection inside DBConnection"+connection);
		return connection;
	}
	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("DB check");
		DBConnection.getConnection();
	}


}
