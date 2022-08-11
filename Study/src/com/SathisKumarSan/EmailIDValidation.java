package com.SathisKumarSan;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDValidation {

	private void validateEmails() {
		ArrayList<String> emails = new ArrayList<String>();  
        
        emails.add("lincy@domain.co.in");  
        emails.add("12453@domain.com");  
        emails.add("tony.name@domain.com");  
        emails.add("1tony#@domain.co.in");
        emails.add("@gmail.com");
        
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        for(String email:emails)
        {
        	Matcher matcher = pattern.matcher(email);
        	System.out.println(email+" : "+matcher.matches());
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmailIDValidation().validateEmails();
	}
}
