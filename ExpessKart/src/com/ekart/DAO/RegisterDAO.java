package com.ekart.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.ekart.Components.EmailValidator;
import com.ekart.DBConnection.DBConnection;
import com.ekart.TO.RegisterTO;

public class RegisterDAO {
	Connection connection = null;
	boolean flag;
	public boolean registerUser(RegisterTO registerTO){
		String userName = registerTO.getUserName();
		String mobileNum = registerTO.getMobileNum();
		String password = registerTO.getUserPassword();

		connection = DBConnection.getConnection();
		try{
			if(registerTO.getUserName() !=null || registerTO.getMobileNum() != null){
				EmailValidator email = new EmailValidator();
				boolean b = email.validate(userName);
				if(b==true){
					Statement statement = connection.createStatement();
					int x = statement.executeUpdate("insert into user values('"+null+"','"+userName+"','"+mobileNum+"','"+password+"')");
					if(x==1){
						flag = true;	
					}
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return flag;
	}

}
