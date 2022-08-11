package com.interview;

import java.util.ArrayList;
import java.util.Scanner;

public class Family {
	static ArrayList<FamilyDetails> famDe = new ArrayList<FamilyDetails>();
	public static void main(String[] args) {
		new Family().findmembers();
	}

	private void findmembers() { 
		
		famDe.add(new FamilyDetails("Steffon Baratheon", "Rhaella Targaryen", "Ormund Baratheon"));
		famDe.add(new FamilyDetails("Aerys Targaryen", "Shaera Targaryen", "Jaehaerys Targaryen"));
		famDe.add(new FamilyDetails("Rhaella Targaryen", "Betha Blackwood", "Aegon Targaryen"));
		famDe.add(new FamilyDetails("Robert Baratheon", "Cassandra Estemont", "Steffon Baratheon"));
		famDe.add(new FamilyDetails("Stannis Baratheon", "Cassandra Estemont", "Steffon Baratheon"));
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the father name");
		String fName = sc.nextLine();
		
		for(FamilyDetails fd: famDe)
		{
			
		}
	}

}
