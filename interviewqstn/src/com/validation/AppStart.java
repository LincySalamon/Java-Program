package com.validation;

import java.util.Scanner;

public class AppStart {

	public static void main(String[] args) {
		new AppStart().flowStart();
	}

	public void flowStart() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		while(isTrue)
		{
			System.out.println();
			System.out.println("*******************************************************");
			System.out.println("******************WELCOME TO LOGIN*********************");
			System.out.println("*******************************************************");
			System.out.println();
			System.out.println("1. SignUp");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			
			String choose = sc.nextLine();
			if(choose.length() == 1 && Character.isDigit(choose.charAt(0)))
			{
				int choice = Integer.parseInt(choose);
				switch (choice) {
				case 1: {
					new SignUp().signup();
					break;
				}
				case 2: {
					break;
				}
				case 3: {
					isTrue = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			}
		}
	}

}
