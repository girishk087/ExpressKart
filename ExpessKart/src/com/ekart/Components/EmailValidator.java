package com.ekart.Components;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	private Pattern pattern;
	private Matcher matcher;
	private static final String emailCompile = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public EmailValidator() {
		pattern = pattern.compile(emailCompile);
	}
	
	public boolean validate(String email){
	matcher = pattern.matcher(email);
	return matcher.matches();
	}
	
	public boolean validateMobileNum(String num){
		boolean b= false;
		if(num.length()==10){
			b=true;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the email to validate");
		String email = in.next();
		EmailValidator e = new EmailValidator();
		boolean b = e.validate(email);
		if(b==true)
			System.out.println("Valid email id");
		else
			System.out.println("Wrong email id...!");
	}
}
