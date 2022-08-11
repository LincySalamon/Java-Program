package com.NithinDev;

public class Employee {
	private String empName;
	private int empID;
	private int empAge;
	private long mobNo;
	
	public Employee(String name, int id, int age, long mobno) {
		// TODO Auto-generated constructor stub
		this.empName = name;
		this.empID = id;
		this.empAge = age;
		this.mobNo = mobno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "empName=" + getEmpName() + ", empID=" + getEmpID() + ", empAge=" + getEmpAge() + ", mobNo=" + getMobNo();
	}
}
