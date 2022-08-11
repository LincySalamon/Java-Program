package com.electronicShopDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static JDBCConnection instance;
	private Connection conn;
	private String url = "jdbc:mysql://localhost:3306/electronicshop";
	private String username = "root";
	private String password = "root"; 
	
	private JDBCConnection() throws SQLException{
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(url,username,password); 
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Connection failed "+e.getMessage());
		}
	}
    public Connection getConnection() {
        return conn;
    }
	
	public static JDBCConnection getInstance() throws SQLException{
		if(instance == null)
		{
			instance = new JDBCConnection();
		}
		else if(instance.getConnection().isClosed())
		{
			instance = new JDBCConnection();
		}
		return instance;
	}
}
