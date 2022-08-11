package com.employee.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	
	private String dburl ="jdbc:mysql://localhost:3306/employee";
	private String username = "root";
	private String password = "root";
	private String dbDriver = "com.msql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection conn = null; 
		try {
			conn = DriverManager.getConnection(dburl, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return conn;
	}
	
	public String insert(EmployeeDetail emp) {
		
		loadDriver(dbDriver); 
		Connection conn = getConnection();
		String result = "Data addedd sucessfully";
		String sql = "Insert into employee_details values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,emp.getUname());
			ps.setString(2,emp.getDob());
			ps.setString(3,emp.getMail());
			ps.setString(4, emp.getSalary());
			ps.setString(5, emp.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
			result = "Data not entered";
		}
		return result; 
	} 
	
}
