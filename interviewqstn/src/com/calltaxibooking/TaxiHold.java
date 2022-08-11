package com.calltaxibooking;

public class TaxiHold extends Thread {
	Taxi t;

	public TaxiHold(Taxi t) {
		this.t = t;
	}

	public void run() {
		t.isFree = false;
		try {
			System.out.println("Taxi Id " + t.taxiid + " is Assigned");
			Thread.sleep(6000000);// calculation = Math.abs(pickpoint-droppoint)*60*60*1000
			t.isFree = true;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
