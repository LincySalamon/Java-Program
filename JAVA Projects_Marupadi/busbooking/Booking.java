package com.busbooking;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passenger Name");
		passengerName = sc.nextLine();
		System.out.println("Enter bus number");
		busNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter date of journey dd-mm-yyyy ");
		String dateinput = sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateinput);
		} catch (ParseException e) { 
			e.printStackTrace();
		}
	}

	public boolean isSeatAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
		int capacity = 0;
		for(Bus b : buses)
		{
			if(b.getBusno() == busNo) {
				capacity = b.getCapacity();
			}
		}
		int bookedCount = 0;
		for(Booking booking:bookings) {
			if(booking.busNo == busNo && booking.date.equals(date)) {
				bookedCount++;
			}
		}
		return bookedCount<capacity?true:false;
	}
}
