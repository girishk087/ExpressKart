package com.ekart.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ekart.DAO.RegisterDAO;
import com.ekart.Services.RegisterService;
import com.ekart.TO.RegisterTO;

@SuppressWarnings("serial")
public class ExpressKartServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		System.out.println(path);
		String path1 = "/Register.do";
		if(path.equals(path1)){
			RegisterTO registerTO = new RegisterTO();
			registerTO.setUserID(0);
			registerTO.setUserName("mmanjunath889@gmail.com");
			registerTO.setMobileNum("994572399");
			registerTO.setUserPassword("manju123");
			RegisterService registerService = new RegisterService();
			boolean b = registerService.isRegistered(registerTO);
			if(b==true){
				System.out.println("Registered successfully....!");
			}else
				System.out.println("Failed to register");
			
			
		}else if(path.equals("")){
			
		}else if(path.equals("")){
			
		}
	
	}
}
