package com.employeeservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/employee") 	
public class Employee extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//System.out.println("Hi servlet"); 
		res.setContentType("application/json");
		PrintWriter out = res.getWriter();
		out.print(res);
		out.flush();
		System.out.println(req.getParameter("uname"));
		String empname = req.getParameter("uname");
		String emppassword = req.getParameter("password");
		String empdob = req.getParameter("dob");
		String empmail = req.getParameter("mail"); 
		String empsalary = req.getParameter("salary");
		
		int salary = Integer.parseInt(empsalary);
		
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.setName(empname);emp.setDob(empdob);emp.setEmail(empmail);
		emp.setSalary(salary);
		
		new MainClass().flowManager(emp);
		
		System.out.println(empname+"\t"+emppassword);  
		//res.setStatus(1);
	}
}
