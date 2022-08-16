package ElectronicShop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class AdminAddItems {
	protected LinkedHashMap<String, Double> brandListAdd = new LinkedHashMap<String, Double>();
	 
	public void addItems() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("Are you want to add Items");
			System.out.println("1. YES\t2.NO");
			byte choice = sc.nextByte();
	
			switch (choice) {
			case 1: {
				addItemsToDatabase();
				break;
			} 
			case 2: {
				isTrue = false; 
				break;
			}
			default:
				System.out.println();
				System.out.println("!!! Enter a valid choice !!!");
				break;
			} 
		}
	}
	private void addItemsToDatabase() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Which Brand you want to Update");
		String Brand = sc.nextLine();
		System.out.println("Enter Model of Brand");
		String model = sc.nextLine();
		System.out.println("Enter price of  model");
		Double price = sc.nextDouble();
		
		//brandListAdd.put(model, price); 
		//MobileList.mobileData.get(Brand).putAll(brandListAdd);
		if(DataList.mobileData.get(Brand)!=null)
		{
			System.out.println(model+" "+price);
			DataList.mobileData.get(Brand).putIfAbsent(model, price);
			for(Entry<String, HashMap<String, Double>>   entry : DataList.mobileData.entrySet()) {
				System.out.println(entry.getKey());
				for(Entry<String, Double> entry2 : entry.getValue().entrySet()) {
					System.out.println(entry2.getKey());
				}
			}
			
			
		}
		else
		{
			//System.out.println("added");  
			brandListAdd.put(model, price); 
			DataList.mobileData.putIfAbsent(Brand,brandListAdd);
//			for(Entry<String, HashMap<String, Double>>   entry : MobileList.mobileData.entrySet()) {
//				System.out.println(entry.getKey());
//				for(Entry<String, Double> entry2 : entry.getValue().entrySet()) {
//					System.out.println(entry2.getKey());
//				}
//			}
			System.out.println("Items added Successfully!!!");
		}
		//MobileList.mobileData.put(Brand,brandListAdd);
		
	}
}