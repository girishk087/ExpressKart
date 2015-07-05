package com.ekart.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCheck {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Hello");
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore","root","ebstore");
		System.out.println(conn);
		if(conn!=null)
			System.out.println("sucess");
		else
			System.out.println("hattro");

	}

}
