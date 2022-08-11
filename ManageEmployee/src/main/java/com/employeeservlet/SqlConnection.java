package com.employeeservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class SqlConnection { 
	
	static Connection conn; 
	public String url;
	public String username;
	public String password;
	
	SqlConnection()
	{
		conn = null; 
		url = "jdbc:mysql://localhost:3306/employee";
		username = "root";
		password = "root";
	}
	public void makeConnection() throws SQLException {  
		// TODO Auto-generated method stub
		System.out.println("Create connection");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After connection class");
		conn = DriverManager.getConnection(url,username,password);
		System.out.println("Connected sucessfully!!!!!");
		
	}

	public void executeSelectStatement() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID");
		int id = sc.nextInt();
		String str = "Select * from employee_details where idemployee_id="+id;
		String name,email;
		try {
			java.sql.Statement st  = conn.createStatement();
			ResultSet rs = st.executeQuery(str);
			while(rs.next()) {
				name = rs.getString(2);
				email = rs.getString(4);
				System.out.println("Name: "+name+" Email: "+email);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertStatement(EmployeeDetails emp) {
		try {
			java.sql.Statement st = conn.createStatement();    
			if(st!= null)
			{
				String insertStmt = "Insert into employee_details(name,dob,email,salary) values"
					+ "('"+emp.getName()+"','"+emp.getDob()+"','"+emp.getEmail()+"',"+emp.getSalary()+");";
				st.execute(insertStmt);
				System.out.println("Employee Details Addedd Successfully");
			}
			else {
				System.out.println("Create Statement is null");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void close()
	{
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

