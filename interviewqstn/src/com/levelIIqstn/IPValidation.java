package com.levelIIqstn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Construct a program to validate a IPv4 address string?
Input:
192.7.1.1111
Output:
Invalid*/

public class IPValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IPValidation().findValidation();
	}

	private void findValidation() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the IP address to validate: ");
		String str = sc.nextLine();
		
		String numValidation = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		String ipValidation = numValidation+"\\."+numValidation+"\\."+numValidation+"\\."+numValidation;
		
		Pattern p = Pattern.compile(ipValidation);
		if(str == null)
		{
			System.out.println("Enter a IP Address");
		}
		
		Matcher m = p.matcher(str);
		if(m.matches())
			System.out.println(str+" is Valid");
		else
			System.out.println(str+" is inValid");
	}	

}
