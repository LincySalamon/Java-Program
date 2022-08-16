package com.calltaxibooking;

import java.util.ArrayList;

public class Taxi {
	int taxiid; //taxi number
	char currentPoint = 'A';
	double totalEarn = 0.0;
	ArrayList<Integer> bookingid = new ArrayList<Integer>();
	ArrayList<Character> customerid = new ArrayList<Character>();
	ArrayList<Character> from = new ArrayList<Character>();
	ArrayList<Character> to = new ArrayList<Character>();
	ArrayList<Integer> pickuptime = new ArrayList<Integer>();
	ArrayList<Integer> droptime = new ArrayList<Integer>();
	ArrayList<Double> amount = new ArrayList<Double>();
	boolean isFree = true;
	
	public Taxi(int id) {
		this.taxiid = id;
	}

	public void assign(int bookid, char customerid2, char pickpoint, char droppoint, int picktime) {
		bookingid.add(bookid);
		customerid.add(customerid2);
		from.add(pickpoint);
		to.add(droppoint);
		pickuptime.add(picktime);
		droptime.add(picktime+Math.abs(pickpoint - droppoint));
		amount.add((double)100+((15*Math.abs(pickpoint-droppoint))-5)*10);
		totalEarn += (double)100+((15*Math.abs(pickpoint-droppoint))-5)*10;
		System.out.println("Amount to pay : "+ (100+((15*Math.abs(pickpoint-droppoint))-5)*10));
		this.currentPoint = droppoint;
	}
}
