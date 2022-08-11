package com.jdbcConnectionEx;

import java.util.Scanner;

public class MainClass {
	
	private void getAndSetEmployeeDetails() {
		SQLConnection sqlConn = null;
		try {
			sqlConn = new SQLConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EmployeeDetails emp = new EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the employee details:");
		 * System.out.println("Enter Employee name"); String name = sc.nextLine();
		 * System.out.println("Enter Date of Birth"); String dob = sc.nextLine();
		 * System.out.println("Enter mail Id"); String email = sc.nextLine();
		 * System.out.println("Enter Salary amount"); int salary = sc.nextInt();
		 * 
		 * emp.setName(name);emp.setDob(dob);emp.setEmail(email);emp.setSalary(salary);
		 * 
		 * sqlConn.executeInsertStatement(emp);
		 */
		System.out.println("EmployeeID\t\tEmployeeName\t\tDOB\t\tEmail\t\tSalary");
		sqlConn.executeSelectStatement();
		sqlConn.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass().getAndSetEmployeeDetails();
	}

}
