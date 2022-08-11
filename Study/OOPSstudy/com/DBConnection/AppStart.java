package com.DBConnection;

import java.sql.SQLException;
import java.util.Scanner;

public class AppStart {
	public void flowManager() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("1. View Details By ID");
			System.out.println("2. Add Details");
			System.out.println("3. Exit");
			System.out.println("Enter the choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				new SqlConnection().executeSelectStatement();
				break;
			}
			case 2: {
				new GetEmployeeDetail().getEmployeeDetailFromUser();
				break;
			}
			case 3: {
				new SqlConnection().close();
				isTrue = false;
				break;
			}
			default:
				System.out.println("Enter a valid Choice");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppStart().flowManager();
	}
}
