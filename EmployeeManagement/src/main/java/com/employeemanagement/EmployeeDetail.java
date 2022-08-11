package com.employeemanagement;

public class EmployeeDetail {
	private String uname;
	private String dob;
	private String mail;
	private String salary;
	private String password;
	
	public EmployeeDetail() {
		super();
	}
	public EmployeeDetail(String uname, String dob, String mail, String salary,String password) {
		super();
		this.uname = uname;
		this.dob = dob;
		this.mail = mail;
		this.salary = salary;
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
