package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class SqlConnection {
	
	public void executeSelectStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID");
		int id = sc.nextInt();
		JDBCsingleton dbconnect = null;
			
		try {
			dbconnect = JDBCsingleton.getInstance();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
			
		String str = "Select * from employee_details where idemployee_id="+id;
		String name,email;
		try {
			java.sql.Statement st  = dbconnect.getConnection().createStatement();
			ResultSet rs = st.executeQuery(str);
			while(rs.next()) {
				name = rs.getString(2);
				email = rs.getString(4);
				System.out.println("Name: "+name+" Email: "+email);
			}
			dbconnect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void insertStatement(EmployeeDetails emp) {
		JDBCsingleton dbconnect = null;
		
		try {
			dbconnect = JDBCsingleton.getInstance();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
			
		try {
			java.sql.Statement st = dbconnect.getConnection().createStatement();   
			String insertStmt = "Insert into employee_details(name,dob,email,salary) values"
				+ "('"+emp.getName()+"','"+emp.getDob()+"','"+emp.getEmail()+"',"+emp.getSalary()+");";
			st.execute(insertStmt);
			System.out.println("Employee Details Addedd Successfully");
			dbconnect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close()
	{
		JDBCsingleton dbconnect = null;
		
		try {
			dbconnect = JDBCsingleton.getInstance();
			dbconnect.getConnection().close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
	}	
}
