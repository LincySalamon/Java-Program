package com.jdbcConnectionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnection {
	static Connection conn = null; 
	private String url = "jdbc:mysql://localhost:3306/employee";
	private String username = "root";
	private String password = "root";
	public SQLConnection() throws ClassNotFoundException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password); 
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void executeInsertStatement(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		try {
			Statement st = conn.createStatement();   
			String insertStmt = "Insert into employee_details(name,dob,email,salary) values"
				+ "('"+emp.getName()+"','"+emp.getDob()+"','"+emp.getEmail()+"',"+emp.getSalary()+");";
			st.execute(insertStmt);
			System.out.println("Employee Details Addedd Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void executeSelectStatement() {
		// TODO Auto-generated method stub
		try {
			Statement st = conn.createStatement();
			String selectStmt = "select * from employee_details";
			ResultSet rs = st.executeQuery(selectStmt);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5));
			}
			
		}catch (Exception e) {
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
