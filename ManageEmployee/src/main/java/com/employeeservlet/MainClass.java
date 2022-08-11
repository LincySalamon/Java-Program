package com.employeeservlet;

import java.sql.Connection;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public void flowManager(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		SqlConnection conn = new SqlConnection();
		try {
			conn.makeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.insertStatement(emp);
	}

}
