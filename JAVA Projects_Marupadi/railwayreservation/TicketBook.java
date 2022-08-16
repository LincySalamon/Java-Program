package com.railwayreservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TicketBook {
	static int aLB = 2;
	static int aMB = 1;
	static int aUB = 1;
	static int aRAC = 1;
	static int aWL = 1;
	
	//static List<Integer> lBP = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6....,21));
	static List<Integer> lBP = new ArrayList<Integer>(Arrays.asList(1,2));//lower berth position
	static List<Integer> mBP = new ArrayList<Integer>(Arrays.asList(1));
	static List<Integer> uBP = new ArrayList<Integer>(Arrays.asList(1));
	static List<Integer> racP = new ArrayList<Integer>(Arrays.asList(1));
	static List<Integer> wlP = new ArrayList<Integer>(Arrays.asList(1));
	
	static Queue<Integer> wlList = new LinkedList<Integer>();
	static Queue<Integer> racList = new LinkedList<Integer>();
	static List<Integer> bookedTicketList = new ArrayList<Integer>();
	static Map<Integer, Passenger> passengerData = new HashMap<Integer, Passenger>();
	  
	public void bookTicket(Passenger p,int snumber, String allotedBerth)
	{
		p.number = snumber;//snumber=seatnumber
		p.alloted = allotedBerth;
		passengerData.put(p.passengerid, p);
		bookedTicketList.add(p.passengerid);
		System.out.println();
		System.out.println("Passenger ID "+p.passengerid);
		System.out.println("Passenger Name "+p.name);
		System.out.println("Passenger Age "+p.age);
		System.out.println("passenger gender "+p.gender);
		System.out.println("Alloted Berth "+snumber+allotedBerth);
		System.out.println("---------Ticket Booked Successfully!!!!!!-----------\n");
	}
	public void racTicket(Passenger p,int snumber, String racBerth)
	{
		p.number = snumber;
		p.alloted = racBerth;
		passengerData.put(p.passengerid, p); 
		racList.add(p.passengerid);
		System.out.println(); 
		System.out.println("Passenger ID "+p.passengerid);
		System.out.println("Passenger Name "+p.name);
		System.out.println("Passenger Age "+p.age);
		System.out.println("passenger gender "+p.gender);
		System.out.println("Alloted Berth "+snumber+racBerth);
	}
	public void wlTicket(Passenger p,int snumber, String wlBerth)
	{
		p.number = snumber;
		p.alloted = wlBerth;
		passengerData.put(p.passengerid, p);
		wlList.add(p.passengerid);
		System.out.println(); 
		System.out.println("Passenger ID "+p.passengerid);
		System.out.println("Passenger Name "+p.name);
		System.out.println("Passenger Age "+p.age);
		System.out.println("passenger gender "+p.gender);
		System.out.println("Alloted Berth "+snumber+wlBerth);
	}
	public void bookedTicket() {
		TicketBook tb = new TicketBook();
		if(tb.passengerData.size() == 0)
			System.out.println("No passenger details available");
		else {
			for(Passenger p : passengerData.values()) {
				System.out.println("----------------------------------------------");
				System.out.println("passengerId "+p.passengerid);
				System.out.println("PassengerName "+p.name);
				System.out.println("Passenger Age "+p.age);
				System.out.println("Passenger gender "+p.gender);
				System.out.println("Alloted Birth "+p.number+p.alloted);
				System.out.println("----------------------------------------------");
			}
		}
	}
	public void calcelTicket(int passengerID)
	{
		Passenger p = passengerData.get(passengerID);
		passengerData.remove(passengerID);
		bookedTicketList.remove(passengerID);
		int psnumber = p.number;
		System.out.println("----------Ticket cancelled sucessfully !!!!!!---------------");
		if(p.alloted.equals("L"))
		{
			lBP.add(psnumber);
			aLB++;
		}
		else if(p.alloted.equals("M"))
		{
			mBP.add(psnumber);
			aMB++;
		}
		else if(p.alloted.equals("U"))
		{
			uBP.add(psnumber);
			aUB++;
		}
		//move rac to confirmed berth
		if(racList.size() > 0)
		{
			Passenger passengerFromRAC = passengerData.get(racList.poll());
			int pRacNumber = passengerFromRAC.number;
			racP.add(pRacNumber);
			racList.remove(passengerFromRAC.passengerid);
			aRAC++;
			
			if(wlList.size() > 0)
			{
				Passenger passengerFromWL = passengerData.get(wlList.poll());
				int pWLNumber = passengerFromWL.number;
				wlP.add(pWLNumber);
				wlList.remove(passengerFromWL.passengerid);
				
				passengerFromWL.number = racP.get(0);
				passengerFromWL.alloted = "RAC";
				racP.remove(0);
				racP.add(passengerFromWL.passengerid);
				aWL++;
				aRAC--;
			}
			new Booking().bookTicket(passengerFromRAC);
		}
	}
}
