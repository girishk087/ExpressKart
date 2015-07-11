package com.ekart.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.ekart.DBConnection.DBConnection;
import com.ekart.TO.CategoryTO;
import com.ekart.TO.ProductTO;
import com.ekart.TO.SubCategoryTO;

public class ProductDAO {
	DBConnection dbConnection;
	Connection connection = null;
	boolean flag;
	public boolean addProduct(ProductTO productTO, CategoryTO categoryTO,SubCategoryTO subCategoryTO){
		boolean b = false;
		String productName = productTO.getProductName();
		Double productPrice = productTO.getProductPrice();
		String productGuid = productTO.getProductGuid();
		int productQuantity = productTO.getProductQuantity();
		int productHits = productTO.getHits();
		String tags = productTO.getTags();
		String categoryName = categoryTO.getCategoryName();
		String subCategoryName = subCategoryTO.getSubCategoryName();
		double productOfferPrice = productTO.getOfferPrize();
		String productDescription = productTO.getProductDescription();
		String sql = "insert into products values(null,'"+productName+"','"+productPrice+"','"+productGuid+"','"+productQuantity+"','"+productHits+"','"+tags+"','"+categoryName+"','"+subCategoryName+"','"+productOfferPrice+"','"+productDescription+"')";
		try {
			Statement statement = connection.createStatement();
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return b;
		
	}
}
