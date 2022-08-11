package com.electronicShopDB;

import java.util.Scanner;

public class LoginPage {

	public void login() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("UserName:   ");
		String username = sc.nextLine();
		System.out.println("Password:   ");
		String password = sc.nextLine();
		Dbconnection db = new Dbconnection();
		db.userDetail(username, password);
	}

}
