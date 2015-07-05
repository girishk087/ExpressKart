package com.ekart.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ekart.DBConnection.DBConnection;
import com.ekart.TO.LoginTO;

public class LoginDAO {
	public boolean userLogin(LoginTO loginTo){
		boolean b = false;
		String userName = loginTo.getUserName();
		String password = loginTo.getUserPassword();
		String mobileNum = loginTo.getMobileNumber();
		Connection connection = DBConnection.getConnection();
		String sql1 = "select *from user where user_name='"+userName+"' and user_password='"+password+"'";
		String sql2 = "select *from user where mobile_no='"+mobileNum+"' and user_password='"+password+"'";
		System.out.println(sql1);
		System.out.println(sql2);
		Statement statement = null;
		ResultSet resultSet = null;

		try{
			if(userName!=null){
				statement = connection.createStatement();
				resultSet = statement.executeQuery(sql1);
				if(resultSet.next())
					b=true;
			}
			else if(mobileNum!=null){
				statement = connection.createStatement();
				resultSet = statement.executeQuery(sql2);
				if(resultSet.next())
					b=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

		return b;
	}
}
