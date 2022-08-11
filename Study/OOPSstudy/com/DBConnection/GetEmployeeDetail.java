package com.DBConnection;

import java.util.Scanner;

public class GetEmployeeDetail {

	public void getEmployeeDetailFromUser() {
		// TODO Auto-generated method stub
		EmployeeDetails emp = new EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details:");
		System.out.println("Enter Employee name"); String name = sc.nextLine();
		System.out.println("Enter Date of Birth"); String dob = sc.nextLine();
		System.out.println("Enter mail Id"); String email = sc.nextLine();
		System.out.println("Enter Salary amount"); int salary = sc.nextInt();
		 
		emp.setName(name);emp.setDob(dob);emp.setEmail(email);emp.setSalary(salary);
		
		new SqlConnection().insertStatement(emp);
	}
	
}
