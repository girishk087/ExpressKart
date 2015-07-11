package com.ekart.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.ekart.DBConnection.DBConnection;
import com.ekart.TO.CategoryTO;
import com.ekart.TO.SubCategoryTO;

public class SubCategoryDAO {
	DBConnection dbConnection;
	Connection connection = null;
	 public int addSubCategory(SubCategoryTO subCategoryTO,CategoryTO categoryTO){
		 //boolean b = false;
		 String subCategoryName = subCategoryTO.getSubCategoryName();
		 int categortId = categoryTO.getCategoryId();
		 String sql = "insert into sub_category values(null,'"+subCategoryName+"'+'"+categortId+"')";
		 try {
			Statement statement = connection.createStatement();
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return categortId;
	 }
	
}
