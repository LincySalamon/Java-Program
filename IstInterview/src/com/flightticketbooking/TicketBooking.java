package com.flightticketbooking;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TicketBooking {
	static int bookingId = 1;
	public void bookTicket() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Flight(101 , 102)");
		String flightnum = sc.nextLine();
		System.out.println("Select Category (g-general, t-tatkal)");
		String category = sc.nextLine();  
		//sc.nextLine();
		System.out.println("Seat Availablility");
		
		for(java.util.Map.Entry<String, Flight>   entry : AppStart.flightDetails.entrySet()) {
			if(entry.getKey().equals(flightnum)) 
			{
				for(java.util.Map.Entry<String, ArrayList<Integer>> entry1: entry.getValue().general.entrySet())
				{ 
					System.out.print(entry1.getKey()+"  "+entry1.getValue().size()); 
					System.out.println();
				}
				
			}
		}
		System.out.println("Seat type:");
		
		for(java.util.Map.Entry<String, Flight>   entry : AppStart.flightDetails.entrySet()) {
			if(entry.getKey().equals(flightnum))
			{
				for(java.util.Map.Entry<String, Integer> entry1: entry.getValue().general_price.entrySet())
				{
					System.out.println(entry1.getKey()+"   "+entry1.getValue());
				}
			}
		}
		System.out.println("Which class you want");
		String seattype = sc.nextLine();
		System.out.println("Number of seat required");
		int numOfSeat = sc.nextInt();
		System.out.println("If meals required y/n");
		char isMeals = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Senior citizon y/n");
		char isSeniorPerson = sc.next().charAt(0);
		
		for(java.util.Map.Entry<String, Flight>   entry : AppStart.flightDetails.entrySet()) 
		{
			if(entry.getKey().equals(flightnum)) 
			{
				for(java.util.Map.Entry<String, ArrayList<Integer>> entry1: entry.getValue().general.entrySet())
				{
					if(entry1.getKey().equals(seattype) && entry1.getValue().size() >= numOfSeat) 
					{
						System.out.println(entry1.getValue());
						entry1.getValue().subList(0, numOfSeat).clear();;
						System.out.println(entry1.getValue());
						System.out.println("Your Ticket Has been booked");
						System.out.println("Booking id is"+bookingId);
						bookingId++;
						amount(numOfSeat,flightnum,seattype,isMeals,isSeniorPerson);
					}
					else 
					{
						System.out.println("No available ticket");
					}
				}
				
			}
		}
		
		
	}
	private void amount(int numOfSeat, String flightnum, String seattype, char isMeals, char isSeniorPerson) {
		for(java.util.Map.Entry<String, Flight>   entry : AppStart.flightDetails.entrySet()) {
			if(entry.getKey().equals(flightnum))
			{
				for(java.util.Map.Entry<String, Integer> entry1: entry.getValue().general_price.entrySet())
				{
					if(entry1.getKey().equals(seattype)) 
					{
						System.out.print("Total Amount is   ");
						
						
						if(isMeals == 'n' && isSeniorPerson == 'n') {
							System.out.println(numOfSeat*entry1.getValue());
						}
						else if(isSeniorPerson == 'y')
						{
							int totalAmount = numOfSeat*entry1.getValue();
							int discount = (totalAmount*10)/100;
							System.out.println(totalAmount-discount); 
						}
						else if(isMeals == 'y') {
							System.out.println((numOfSeat*entry1.getValue())+(numOfSeat*200));
						}
						else if(isMeals == 'y' && isSeniorPerson == 'y'){
							int totalAmount = numOfSeat*entry1.getValue();
							int discount = ((totalAmount*10)/100); 
							totalAmount = totalAmount - discount; 
							System.out.println(totalAmount+(numOfSeat*200)); 
						}
						System.out.println("Booking completed");
					}
				}
			}
		}
	}

}
