package com.busbooking;

public class Bus {
	private int busno;
	private boolean isAC;
	private int capacity;
	
	Bus(int busno,boolean isAC,int capacity)
	{
		this.busno = busno;
		this.isAC = isAC;
		this.capacity = capacity;
	}

	public Bus() {
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public boolean isAC() {
		return isAC;
	}

	public void setAC(boolean isAC) {
		this.isAC = isAC;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void displayBus() {
		System.out.println("Bus [busno=" + busno + ", isAC=" + isAC + ", capacity=" + capacity + "]");
	}

}
