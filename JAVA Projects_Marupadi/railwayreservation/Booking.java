package com.railwayreservation;

import java.util.Scanner;

public class Booking {

	public void UserDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passenger Name :");
		String name = sc.nextLine();
		System.out.println("Enter Passenger Age :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Passenger Gender : [M,F]");
		String gender = sc.nextLine();
			if(gender.equals("F") || gender.equals("f"))
			{
				System.out.println("1. If you have a child\n2. If you havn't child");
				int childChoice = sc.nextInt();
				
				if(childChoice == 1)
				{
					sc.nextLine();
					System.out.println("Enter child name :");
					String cname = sc.nextLine();
					System.out.println("Enter child age :");
					int cage = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Berth preference : [L,M,U]");
					String bp = sc.nextLine();
					Passenger p = new Passenger(name , age , gender , cname , cage, bp);
					bookTicket(p);
				}
				else if(childChoice == 2)
				{ 
					sc.nextLine();
					System.out.println("Enter Berth preference : [L,M,U]");
					String bp = sc.nextLine();
					String cname = "nochild";
					int cage = 0;
					Passenger p = new Passenger(name , age , gender , cname , cage, bp);
					bookTicket(p);
				}
			}
			if(gender.equals("M") || gender.equals("m"))
			{
				System.out.println("Enter Berth preference : [L,M,U]");
				String bp = sc.nextLine();
				String cname = "nochild";
				int cage = 0;
				Passenger p = new Passenger(name , age , gender , cname , cage, bp);
				bookTicket(p);
			}
	}
	public static void bookTicket(Passenger p) {
		TicketBook tb = new TicketBook();
		
		if(TicketBook.aWL == 0)
		{
			System.out.println("Sorry!!!!No tickets Available!!!!!!");
		}
		else if(p.age>60 && TicketBook.aLB>0)//senior citizens
		{
			System.out.println("You are a senior citizen person so we'll give you Lower Berth");
			tb.bookTicket(p,(TicketBook.lBP.get(0)),"L");
			TicketBook.lBP.remove(0);
			TicketBook.aLB--;
		}
		else if(p.cname != "nochild" && TicketBook.aLB > 0)
		{
			System.out.println("You have a child so we'll give lower berth");
			tb.bookTicket(p, (TicketBook.lBP.get(0)), "L");
			TicketBook.lBP.remove(0);
			TicketBook.aLB--;
		}
		//Berth given for choosed berth by passenger
		else if(p.bp.equals("L") || p.bp.equals("l") && TicketBook.aLB > 0 || p.bp.equals("M") || p.bp.equals("m") && TicketBook.aMB > 0 || p.bp.equals("U") || p.bp.equals("u") && TicketBook.aUB > 0)
		{
			if(p.bp.equals("L") || p.bp.equals("l"))
			{
				System.out.println("Lower Berth Given");
				tb.bookTicket(p,(TicketBook.lBP.get(0)),"L");
				TicketBook.lBP.remove(0);
				TicketBook.aLB--;
			}
			else if(p.bp.equals("M") || p.bp.equals("m"))
			{
				System.out.println("Middle Berth Given");
				tb.bookTicket(p,(TicketBook.mBP.get(0)),"M");
				TicketBook.mBP.remove(0);
				TicketBook.aMB--;
			}
			else if(p.bp.equals("U") || p.bp.equals("u"))
			{
				System.out.println("Upper Berth is Given");
				tb.bookTicket(p, (TicketBook.uBP.get(0)), "U");
				TicketBook.uBP.remove(0);
				TicketBook.aUB--;
			}
		}//if preferred berth is not available go for available berth
		else if(TicketBook.aLB>0)
		{
			System.out.println("Lower Berth Given");
			tb.bookTicket(p,(TicketBook.lBP.get(0)),"L");
			TicketBook.lBP.remove(0);
			TicketBook.aLB--;
		}
		else if(TicketBook.aMB>0)
		{
			System.out.println("Middle Berth Given");
			tb.bookTicket(p,(TicketBook.mBP.get(0)),"M");
			TicketBook.mBP.remove(0);
			TicketBook.aMB--;
		}
		else if(TicketBook.aUB>0)
		{
			System.out.println("Upper Berth is Given");
			tb.bookTicket(p, (TicketBook.uBP.get(0)), "U");
			TicketBook.uBP.remove(0);
			TicketBook.aUB--;
		}
		//moving to rac if ticket is not available
		else if(TicketBook.aRAC>0)
		{
			System.out.println("Berth is not available so give RAC");
			tb.racTicket(p, (TicketBook.racP.get(0)), "RAC");
			TicketBook.racP.remove(0);
			TicketBook.aRAC--;
		}
		else if(TicketBook.aWL>0)
		{
			System.out.println("No Berth available please wait");
			tb.wlTicket(p, (TicketBook.wlP.get(0)), "WL");
			TicketBook.wlP.remove(0);
			TicketBook.aWL--;
		}
	}
	public void availableBookTicket() {
		TicketBook tb = new TicketBook();
		System.out.println("Available Lower berth ticket is: "+TicketBook.aLB);
		System.out.println("Available Middle berth ticket is: "+TicketBook.aMB);
		System.out.println("Available Upper berth ticket is: "+TicketBook.aUB);
		System.out.println("Available RAC ticket is: "+TicketBook.aRAC);
		System.out.println("Available WL ticket is: "+TicketBook.aWL);
	}

}
