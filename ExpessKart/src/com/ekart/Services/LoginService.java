package com.ekart.Services;

import com.ekart.DAO.LoginDAO;
import com.ekart.TO.LoginTO;

public class LoginService {
	LoginDAO loginDAO;
	public LoginService(){
		loginDAO = new LoginDAO();
	}
	
	public boolean isUserLoginValid(LoginTO loginTO){
		boolean b = loginDAO.userLogin(loginTO);
		return b;
	}

}
