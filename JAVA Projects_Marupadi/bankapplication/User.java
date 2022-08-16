package com.bankapplication;

public class User {
	static long accountnum = 1393001025970L;
	long accNum;
	private String name;
	private Long mobile;
	private String password;
	private Double balance;
	
	public User(String name,Long mobile,String password) {
		this.accNum = accountnum++;
		this.name = name; 
		this.password = password;
		this.balance = 1000.00; 
		this.mobile = mobile;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
