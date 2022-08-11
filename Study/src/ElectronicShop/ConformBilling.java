package ElectronicShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ConformBilling {

	public void billGeneration(String name,LinkedHashMap<String, HashMap<String, Double>> cartItems,String item) {
		// TODO Auto-generated method stub
		int randomNum = randomNumber();
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.print("USER NAME: "+name+"\t\t\t"+"Bill No: "+randomNum);
		System.out.println("\n");
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("ITEMS"+"\t\t"+" QUANTITY "+"\t\t"+"AMOUNT");
		System.out.println("--------------------------------------------------------");
		int index = 0;
		if(item == "MOBILE")
		{
			for(Entry<String,HashMap<String, Double>> entry:MobileDetails.cartItems.entrySet())
			{ 		
				for(Entry<String, Double> entry1 : entry.getValue().entrySet()) 
				{
					String[] key = null; 
					key = entry1.getKey().split("_");
					Double singleValueforProduct = DataList.mobileData.get(key[0]).get(key[1]);  
					int val = (int) (entry1.getValue()/singleValueforProduct);
					System.out.println(entry1.getKey()+"\t\t"+val+"\t\t"+entry1.getValue());
				}
			}
		}
		if(item == "LAPTOP")
		{
			for(Entry<String,HashMap<String, Double>> entry:MobileDetails.cartItems.entrySet())
			{ 		
				for(Entry<String, Double> entry1 : entry.getValue().entrySet())  
				{
					String[] key = null; 
					key = entry1.getKey().split("_");
					Double singleValueforProduct = DataList.laptopData.get(key[0]).get(key[1]);  
					int val = (int) (entry1.getValue()/singleValueforProduct);
					System.out.println(entry1.getKey()+"\t\t"+val+"\t\t"+entry1.getValue());
				}
			}
		}
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
	}

	private int randomNumber() {
		// TODO Auto-generated method stub
		int randomNum = 0;
		int max = 900;
		int min = 1;
		int range = max-min+1;
		for(int i=0;i<max;i++) 
		{
			randomNum = (int)(Math.random()*range) + min;
		}
		return randomNum;
	}

}
