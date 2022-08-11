package com.NandhaSan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MobileList {
	static LinkedHashMap<String, HashMap<String, Double>> mobileData = new LinkedHashMap<String, HashMap<String,Double>>();
	LinkedHashMap<String, Double> brandListAdd = new LinkedHashMap<String, Double>();
	public void mobileList() {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Double> brandList = new LinkedHashMap<String, Double>();
		LinkedHashMap<String, Double> brandList1 = new LinkedHashMap<String, Double>();
		LinkedHashMap<String, Double> brandList2 = new LinkedHashMap<String, Double>();
		brandList.put("SE", 25000.00);
		brandList.put("APPLE 8", 55000.00);
		brandList.put("APPLE 11", 85000.00);
		mobileData.put("APPLE", brandList);
		brandList1.put("NORD", 30000.00);
		brandList1.put("ONE PLUS 5T", 55000.00);
		brandList1.put("ONE PLUS 8T", 95000.00);
		mobileData.put("ONE PLUS", brandList1);
		brandList2.put("NOTE 10", 30000.00);
		brandList2.put("GALAXY S8", 55000.00);
		brandList2.put("GALAXY S10", 100000.00);
		mobileData.put("SAMSUNG", brandList2);
		String val ="APPLE";
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number of items Add");
		int numOfItem = sc.nextInt();
		while(numOfItem>0)
		{
			System.out.println("Enter Which Brand you want to Update");
			sc.nextLine();
			String Brand = sc.nextLine();
			System.out.println("Enter Model of Brand");
			String model = sc.nextLine();
			System.out.println("Enter price of  model");
			Double price = sc.nextDouble();
			
			//brandListAdd.put(model, price);
			mobileData.get(Brand).put(model,price);
			//mobileData.put(Brand,brandListAdd);
			numOfItem--;
		}
		
		int num = 1;
		for(Entry<String, HashMap<String, Double>> entry : mobileData.entrySet())
		{
			if(entry.getKey().equals(val))
			{
				for(Entry<String, Double> entry2 : entry.getValue().entrySet())
				{
					System.out.printf(num++ +". "+"%-15s %s\n",entry2.getKey(),entry2.getValue());
					//System.out.print(num++ +". "+entry2.getKey());
					//System.out.println(entry2.getValue());
				}
			}
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MobileList().mobileList();
	}

}
