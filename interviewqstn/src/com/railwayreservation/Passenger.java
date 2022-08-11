package com.railwayreservation;

public class Passenger {
	static int id = 1;
	String name;
	int age;
	String gender;
	String bp;//berth preference
	int passengerid = id++;
	String alloted;//berth allocation of a passenger
	int number;//for 1l or 2l or 3l mention
	String cname;
	int cage;
	
	public Passenger(String name,int age,String gender,String cname,int cage,String bp)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bp = bp;
		this.cname = cname;
		this.cage = cage;
		alloted = " ";
		number = -1;
	}
}
