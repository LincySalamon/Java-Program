package com.railwayreservation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().startingPoint();
	}

	private void startingPoint() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("---------------WELCOME TO RAILWAY TICKET BOOKING---------------------");
			System.out.println("1. Tickt Book\n2. Cancel Ticket\n3. Print Booked Tickets\n4. Print Available Tickets\n5. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				new Booking().UserDetails();
				break;
			}
			case 2: {
				System.out.println("Enter passenger ID ");
				int id = sc.nextInt();
				new TicketBook().calcelTicket(id);
				break;
			}
			case 3: {
				new TicketBook().bookedTicket();
				break;
			}
			case 4: {
				new Booking().availableBookTicket();
				break;
			}
			case 5: {
				loop = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}

}
