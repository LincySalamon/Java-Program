package com.bankapplication;

import java.util.Scanner;

public class LoginPage {

	public void login() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Long accnum = null;
		Long mobile = null;
		int i =0;
		
		while(i<2)
		{
			System.out.println("Enter Account Number: ");
			accnum = sc.nextLong();
			System.out.println("Enter Mobile Number: ");
			mobile = sc.nextLong();
			
			Long checkMobile = SignUpPage.userDetail.get(accnum).getMobile();	
			if(SignUpPage.userDetail.containsKey(accnum) && mobile.equals(checkMobile))
			{
				new AccountPage().makeAccountProcess(accnum);
				i=2;
			}
			else {
				System.out.println("Enter a valid credentials");
				i++;
			}
		}
	}

}
