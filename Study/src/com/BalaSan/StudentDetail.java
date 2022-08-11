package com.BalaSan;


public class StudentDetail { 
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id2) {
		this.id = id2;
	}
	@Override
	public String toString() {
		return "StudentDetail [name=" + name + ", id=" + id + "]";
	}
	}

