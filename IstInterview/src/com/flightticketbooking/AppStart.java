package com.flightticketbooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
public class AppStart { 
	static HashMap<String, Flight> flightDetails = new HashMap<String, Flight>();
	HashMap<String,ArrayList<Integer>> general = new HashMap<String,ArrayList<Integer>>();
	ArrayList<Integer> business_general = new ArrayList<Integer>(); 
	ArrayList<Integer> business_tatkal = new ArrayList<Integer>();
	HashMap<String,ArrayList<Integer>> tatkal = new HashMap<String,ArrayList<Integer>>();
	ArrayList<Integer> economy_general = new ArrayList<Integer>(); 
	ArrayList<Integer> economy_tatkal = new ArrayList<Integer>(); 
	HashMap<String, Integer> general_price = new HashMap<String, Integer>();
	HashMap<String, Integer> tatkal_price = new HashMap<String, Integer>();
	
	public void flowStart() {
		
		for(int k = 101;k<=102;k++) {
			 
			for(int i=1;i<=4;i++)
			{
				business_general.add(i);
			}
			general.put("business", business_general);
			for(int i=7;i<=14;i++)
			{
				business_tatkal.add(i); 
			}
			general.put("economy", business_tatkal);
			
			
			
			//adding seat for economy
			
			for(int i=5;i<=6;i++)
			{
				economy_general.add(i);
			}
			tatkal.put("business", economy_general);
			for(int i=15;i<=18;i++)
			{
				economy_tatkal.add(i);
			} 
			tatkal.put("economy", economy_tatkal);
			//business class price
			
			general_price.put("business", 2000);
			general_price.put("economy", 1000);
			
			//economy class price
			
			tatkal_price.put("business", 3000);
			tatkal_price.put("economy", 2000);
			
			flightDetails.put(""+k, new Flight(general,tatkal,general_price,tatkal_price)); 
			
		}
//		flightDetails.put("101", new Flight(general,tatkal,general_price,tatkal_price)); 
//		flightDetails.put("102", new Flight(general,tatkal,general_price,tatkal_price));
//		
		appflow();
	}

	
	
	public void appflow() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("***************WELCOME TO AAA AIRWAYS***************");
			System.out.println("1. Ticket Booking");
			System.out.println("2. Ticket Cancellation");
			System.out.println("3. print ticket");
			System.out.println("9. Exit");
			System.out.println("****************************************************");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				new TicketBooking().bookTicket();
				break;
			}
			case 3: {
				//new Print().printticket();
				break;
			}
			case 9: {
				isTrue = false;
				break;
			}
			default:
				System.out.println("Enter a valid choice");
			}
		}
		
	}



	public static void main(String[] args) {
		new AppStart().flowStart();
	}
}
