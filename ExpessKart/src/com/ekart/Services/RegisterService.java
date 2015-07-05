package com.ekart.Services;

import com.ekart.DAO.RegisterDAO;
import com.ekart.TO.RegisterTO;

public class RegisterService {
	
	private RegisterDAO registerDAO;

	public RegisterService() {
		registerDAO = new RegisterDAO();
	}

	public boolean isRegistered(RegisterTO registerTO){
		boolean b=registerDAO.registerUser(registerTO);
		return b;
	}


}
