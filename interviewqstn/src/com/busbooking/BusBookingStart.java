package com.busbooking;

import java.util.ArrayList;
import java.util.Scanner;

public class BusBookingStart {

	public static void main(String[] args) {
		new BusBookingStart().bookStart();
	}

	private void bookStart() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,2));
		buses.add(new Bus(3,false,1));
		
		ArrayList<Booking> bookings = new ArrayList<Booking>();

		boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("--------------------Welcome to AAA Bus service------------------");
			System.out.println("1. Booking");
			System.out.println("2. View Buses");
			System.out.println("3. Exit");
			int userOpt = sc.nextInt();
			switch (userOpt) {
			case 1: {
				Booking booking = new Booking();
				if(booking.isSeatAvailable(buses,bookings))
				{
					bookings.add(booking);
					System.out.println("Ticket Booked");
				}
				else {
					System.out.println("No seat available on a bus on this date!!!!");
				}
				break;
			}
			case 2: {
				for(Bus b:buses)
				{
					b.displayBus();
				}
				break;
			}
			case 3: {
				isTrue = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + userOpt);
			}
		}
	}

}
