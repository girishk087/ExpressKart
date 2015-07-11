package com.ekart.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.ekart.DBConnection.DBConnection;
import com.ekart.TO.CategoryTO;

public class CategoryDAO {
	DBConnection connect;
	Connection connection = null;
	
	public boolean addCategory(CategoryTO categoryTO){
		boolean b = false;
		String categoryName = categoryTO.getCategoryName();
		connection = DBConnection.getConnection();
		String sql = "insert into category values(null,+'"+categoryName+"')";
		try {
			Statement statement = connection.createStatement();
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

}
