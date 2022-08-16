package com.calltaxibooking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TaxiBooking {
	static int bookid = 1;

	public void bookTaxi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID:");
		char customerid = sc.next().charAt(0);
		System.out.println("Enter Pickup Point: ");
		char pickpoint = sc.next().charAt(0);
		System.out.println("Enter Drop Point: ");
		char droppoint = sc.next().charAt(0);
		System.out.println("Enter PickUp Time: ");
		int picktime = sc.nextInt();
		int reject = 1;

		for (Taxi t : TaxiBook.taxies) {
			if ((t.isFree == true) && (t.currentPoint == pickpoint)) {
				t.assign(bookid, customerid, pickpoint, droppoint, picktime);
				bookid++;
				TaxiHold th = new TaxiHold(t);
				th.start();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				return;
			}
			if (t.isFree == true)
				reject = 0;
		}
		if (reject == 1) {
			System.out.println("Sorry No Taxi Available Now!!!!!!");
			System.out.println("Please Try After Some Time Thank You!!!!!!");
			return;
		}

		ArrayList<Taxi> nearestTaxi = new ArrayList<Taxi>();
		for (Taxi t : TaxiBook.taxies) {
			if (t.isFree == true) {
				if (Math.abs(t.currentPoint - pickpoint) == 1)
					nearestTaxi.add(0, t);
				else
					nearestTaxi.add(t);
			}
		}
		if (nearestTaxi.size() == 1) {
			nearestTaxi.get(0).assign(bookid, customerid, pickpoint, droppoint, picktime);
			bookid++;
			TaxiHold th = new TaxiHold(nearestTaxi.get(0));
			th.start();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			return;
		} else if (pickpoint == 'A'
				|| pickpoint == 'F' && (Math.abs(nearestTaxi.get(0).currentPoint - pickpoint)) == 1) {
			nearestTaxi.get(0).assign(bookid, customerid, pickpoint, droppoint, picktime);
			bookid++;
			TaxiHold th = new TaxiHold(nearestTaxi.get(0));
			th.start();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			return;
		} else {
			int min = Math.abs(nearestTaxi.get(0).currentPoint - pickpoint);
			int iden = 0, loc = 0;
			for (int i = 0; i < nearestTaxi.size(); i++) {
				if (min > Math.abs(nearestTaxi.get(i).currentPoint - pickpoint)) {
					min = Math.abs(nearestTaxi.get(i).currentPoint - pickpoint);
					loc = i;
				} else {
					nearestTaxi.remove(i);
				}
				if (min == Math.abs(nearestTaxi.get(i).currentPoint - pickpoint)) {
					iden++;
				}
			}
			if (iden == 0) {
				nearestTaxi.get(loc).assign(bookid, customerid, pickpoint, droppoint, picktime);
				bookid++;
				TaxiHold th = new TaxiHold(nearestTaxi.get(loc));
				th.start();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				return;
			} else {
				double minEarn = nearestTaxi.get(0).totalEarn;
				int minLoc = 0;
				for (int i = 0; i < nearestTaxi.size(); i++) {
					if (minEarn > nearestTaxi.get(i).totalEarn) {
						minEarn = nearestTaxi.get(i).totalEarn;
						minLoc = i;
					}
				}
				nearestTaxi.get(minLoc).assign(bookid, customerid, pickpoint, droppoint, picktime);
				bookid++;
				TaxiHold th = new TaxiHold(nearestTaxi.get(minLoc));
				th.start();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				return;
			}

		}
	}

}
