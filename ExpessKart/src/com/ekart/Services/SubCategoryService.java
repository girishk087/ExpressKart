package com.ekart.Services;

import com.ekart.DAO.SubCategoryDAO;
import com.ekart.TO.CategoryTO;
import com.ekart.TO.SubCategoryTO;

public class SubCategoryService {
	SubCategoryDAO subCategoryDAO;
	SubCategoryService(){
		subCategoryDAO = new SubCategoryDAO();
	}
	
	public boolean isSubCategoryAdd(SubCategoryTO subCategoryTO){
		
		boolean b = subCategoryDAO.addSubCategory(subCategoryTO, categoryTO);
		return b;
	}

}
