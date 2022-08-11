package com.calltaxibooking;

public class TaxiDetails {

	public void getTaxiDetails() {
		for (Taxi t : TaxiBook.taxies) {
			System.out.println(" ");
			System.out.println("Taxi ID: " + t.taxiid);
			System.out.println("Total Earnings :" + t.totalEarn);
			System.out.println(" ");
			System.out.println("BookingID\tCustomerId\tFrom\tTo\tPickUpTime\tDropTime\tAmount");
			for (int i = 0; i < t.bookingid.size(); i++) {
				System.out.print(t.bookingid.get(i));
				System.out.print("\t\t" + t.customerid.get(i));
				System.out.print("\t\t" + t.from.get(i));
				System.out.print("\t" + t.to.get(i));
				System.out.print("\t\t" + t.pickuptime.get(i));
				System.out.print("\t\t" + t.droptime.get(i));
				System.out.print("\t\t" + t.amount.get(i));
				System.out.println();
			}
			System.out.println(" ");
		}

	}

	public void taxiStatus() {
		for (Taxi t : TaxiBook.taxies) {
			if (t.isFree == true) {
				System.out.println("Taxi Id " + t.taxiid + " is free(Availabale Now)");
			} else {
				System.out.println("Taxi Id " + t.taxiid + " is busy(Not Availabale Now)");
			}
		}
	}

}
