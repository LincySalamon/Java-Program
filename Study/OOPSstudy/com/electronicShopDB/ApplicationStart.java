package com.electronicShopDB;

import java.util.Scanner;

public class ApplicationStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ApplicationStart().startApp();
	}

	private void startApp() {
		// TODO Auto-generated method stub
//		Dbconnection dbconn = new Dbconnection();
//		dbconn.executeSelectStatement();
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		boolean isAdmin = false;
		while(isTrue) 
		{
			System.out.println("*************************************************************************");
			System.out.println("\n-----------------------------ELECTRONIC SHOP-----------------------------\n");
			System.out.println("*************************************************************************");
			System.out.println("\t\t\t\t1. UserLogin\t\t\t\t");
			System.out.println("\t\t\t\t2. AdminLogin\t\t\t\t");
			System.out.println("\t\t\t\t3. RegisterUser\t\t\t\t");
			System.out.println("\t\t\t\t100. Exit\t\t\t\t");
			
			String choice = sc.nextLine(); 
			if(choice.length() == 1 && Character.isDigit(choice.charAt(0)))
			{
				byte choose = Byte.parseByte(choice);
				switch (choose) {
					case 1: {
						new LoginPage().login();
						break;
					}
					case 2: {
						isAdmin = true;
						break;
					}
					case 3: {
						break;
					}
					case 100 : {
						isTrue = false;
						break;
					}
					default: {
						System.out.println();
						System.out.println("!!! Enter a valid choice !!!");
						break;
					}
				}
			}
			else {
				System.out.println("Enter Valid Choice");
			}
		}
	}

}
