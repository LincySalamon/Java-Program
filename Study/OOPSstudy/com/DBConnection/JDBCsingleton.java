package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.electronicShopDB.JDBCConnection;

public class JDBCsingleton {
	
	private static JDBCsingleton instance;  
	private Connection conn;
	private String url = "jdbc:mysql://localhost:3306/employee";
	private String username = "root";
	private String password = "root"; 
	
	private JDBCsingleton() throws SQLException{
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
	
	public static JDBCsingleton getInstance() throws SQLException{ 
		if(instance == null)
		{
			instance = new JDBCsingleton(); 
		}
		else if(instance.getConnection().isClosed())
		{
			instance = new JDBCsingleton();
		}
		return instance;
	}
	public void close()
	{
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
