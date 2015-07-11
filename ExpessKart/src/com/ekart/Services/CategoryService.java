package com.ekart.Services;

import com.ekart.DAO.CategoryDAO;
import com.ekart.TO.CategoryTO;

public class CategoryService {
	CategoryDAO categoryDAO;
	 public CategoryService(){
		 categoryDAO = new CategoryDAO();
	 }
	 
	 public boolean isCategoryAdd(CategoryTO categoryTO){
		 boolean b = categoryDAO.addCategory(categoryTO);
		 return b;
	 }

}
