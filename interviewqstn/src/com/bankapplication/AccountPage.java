package com.bankapplication;

import java.util.Scanner;

public class AccountPage {

	public void makeAccountProcess(Long accnum) {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("**************CHOOSE PROCESS TYPE**************");
			System.out.println("		1. Deposit");
			System.out.println("		2. Withdraw");
			System.out.println("		3. Transfer");
			System.out.println("		4. Check Balance");
			System.out.println("		5. Logout");
			System.out.println("***********************************************");
			
			String choose = sc.nextLine();
			if(Character.isDigit(choose.charAt(0)) && choose.length()==1)
			{
				int choice = Integer.parseInt(choose);
				switch (choice) {
				case 1: {
					new ProcessingPage().deposit(accnum);
					break;
				}
				case 2: {
					new ProcessingPage().withdraw(accnum);
					break;
				}
				case 3: {
					new ProcessingPage().transfer(accnum);
					break;
				}
				case 4: {
					new ProcessingPage().checkbalance(accnum);
					break;
				}
				case 5: {
					isTrue = false;
					break;
				}
				default:
					System.out.println("Enter a valid process");
				}
			}
			else {
				System.out.println("Enter a valid process");
			}
			
		}
	}

}
