package com.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class Employee extends HttpServlet {

	private static final long serialVersionUID = 1L;

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
//	{
//		PrintWriter writer = res.getWriter();
//		writer.println("hai");
//		
//	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("Hi servlet"); 
		
		/*
		 * String uname = req.getParameter("uname"); String dob =
		 * req.getParameter("dob"); String mail = req.getParameter("mail"); String
		 * salary = req.getParameter("salary"); String password =
		 * req.getParameter("password");
		 * 
		 * EmployeeDetail emp = new EmployeeDetail(uname,dob,mail,salary,password);
		 * 
		 * DBConnection db = new DBConnection(); String result = db.insert(emp);
		 * res.getWriter().print(result);
		 */
	}
}
