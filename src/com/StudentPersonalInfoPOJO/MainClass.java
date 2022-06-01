package com.StudentPersonalInfoPOJO;

import java.util.Scanner;

public class MainClass {
	
	private void getDetails() {
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while(exit)
		{
			System.out.println("1.Enter Student Detail: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				new StudentRecordCreation().studentcreation();
				break;
			}
		}
	}
	public static void main(String[] args) {
		MainClass maincls = new MainClass();
		maincls.getDetails();
	}
	
}
