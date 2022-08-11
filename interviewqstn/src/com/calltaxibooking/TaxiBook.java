package com.calltaxibooking;

import java.util.ArrayList;
import java.util.Scanner;

public class TaxiBook {
	static ArrayList<Taxi> taxies = new ArrayList<Taxi>();

	TaxiBook() {
		for (int i = 1; i <= 4; i++) {
			Taxi t = new Taxi(i);
			taxies.add(t);
		}
	}

	private void getDetails() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("-------------------TAXI BOOOKING-------------------");
			System.out.println("Working with 4 taxi");
			System.out.println("1. Book Taxi");
			System.out.println("2. Taxi Details");
			System.out.println("3. Taxies Status");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				new TaxiBooking().bookTaxi();
				break;
			}
			case 2: {
				new TaxiDetails().getTaxiDetails();
				break;
			}
			case 3: {
				new TaxiDetails().taxiStatus();
				break;
			}
			case 4: {
				isTrue = false;
				break;
			}
			default:
				System.out.println("Enter a correct choice");
			}
		}
	}

	public static void main(String args[]) {
		new TaxiBook().getDetails();
	}
}
