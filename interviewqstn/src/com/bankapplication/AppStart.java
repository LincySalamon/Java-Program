package com.bankapplication;

import java.util.Scanner;

public class AppStart {

	private void startApp() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************************************************************");
		System.out.println("			WELCOME TO AAA BANK");
		System.out.println("**************************************************************************");
		boolean isTrue = true;
		
		while(isTrue)
		{
			System.out.println("		1. SignUp");
			System.out.println("		2. Login");
			System.out.println("		3. ExitApp");
			System.out.println("Enter your choice");
			String choose = sc.nextLine();
			if(Character.isDigit(choose.charAt(0)) && choose.length()==1)
			{
				int choice = Integer.parseInt(choose);
				switch (choice) {
				case 1: {
					new SignUpPage().signup();
					break;
				}
				case 2: {
					new LoginPage().login();		
					break;
				}
				case 3: {
					isTrue = false;
					break;
				}
				default:
					System.out.println("Select a Valid Choice");
				}
			}
			else {
				System.out.println("Select Valid Choice");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppStart().startApp();
	}
}
