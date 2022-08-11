package com.electronicShopDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection {
	static Connection conn = null; 
	public Dbconnection(){
		try {
			String url = "jdbc:mysql://localhost:3306/electronicshop";
			String username = "root";
			String password = "root"; 
			conn = DriverManager.getConnection(url, username, password); 
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void executeSelectStatement(){     
		try {
			Statement st = conn.createStatement();
			String str = "Select username,isadmin from user_details";
			System.out.println("after select statement");
			ResultSet rs = st.executeQuery(str);
			while(rs.next()) {
				System.out.println("Inside select statment data fetching");
				System.out.println(rs.getString(1)+"\t\t"+rs.getInt(4));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void userDetail(String username,String password) {
		try { 
			Statement st = conn.createStatement();
			String str = "select username,isadmin from user_details where password= "+password; 
		}
		catch(SQLException e) {
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
