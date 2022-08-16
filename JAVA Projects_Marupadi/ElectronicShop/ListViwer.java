package ElectronicShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class ListViwer {
	Scanner sc = new Scanner(System.in);
	ArrayList<Entry<String,Double>> listtoAdd = new ArrayList<Entry<String,Double>>();
	HashMap<String, Double> cartVal = new HashMap<String, Double>();
	
	public void listViwer(String s,String name,String item)
	{
		
		boolean isTrue = true;
		while(isTrue)
		{
			if(s != null) 
			{  
				int num = 1;
				if(item == "MOBILE") {
					for(Entry<String, HashMap<String, Double>> entry : DataList.mobileData.entrySet())
					{
						if(entry.getKey().equals(s))
						{
							for(Entry<String, Double> entry2 : entry.getValue().entrySet())
							{
								System.out.printf(num++ +". "+"%-20s %s\n",entry2.getKey(),entry2.getValue());
								listtoAdd.add(entry2); 
							}
						} 
					}
				}
				if(item == "LAPTOP") {
					for(Entry<String, HashMap<String, Double>> entry : DataList.laptopData.entrySet())
					{
						if(entry.getKey().equals(s))
						{
							for(Entry<String, Double> entry2 : entry.getValue().entrySet())
							{
								System.out.printf(num++ +". "+"%-20s %s\n",entry2.getKey(),entry2.getValue());
								listtoAdd.add(entry2);
							}
						} 
					}
				}
				if(!name.equals("Admin"))  
				{
					System.out.println("100. Back to Menu");
					System.out.println("101. Conform to Billing");
					System.out.println("Select choice to Buy");
					System.out.println();
				}
				byte choice = sc.nextByte();
				if(choice == 100)
				{
					isTrue = false;
				} 
				else if(choice == 101)
				{
					new ConformBilling().billGeneration(name,MobileDetails.cartItems,item); 
				}
				else if(choice >= listtoAdd.size() && choice !=100)
				{
					System.out.println("Invalid Choice!!!");
				}
				else {
					String keyVal = s+"_"+listtoAdd.get(choice-1).getKey();
					if(cartVal.containsKey(keyVal))
					{ 	
						Double val = listtoAdd.get(choice-1).getValue();
						val += cartVal.get(keyVal);    
						cartVal.put(keyVal, val);
					} 
					else {
						cartVal.put(s+"_"+listtoAdd.get(choice-1).getKey(), listtoAdd.get(choice-1).getValue());
					}
					MobileDetails.cartItems.put(name, cartVal);   
					
					for(Entry<String,HashMap<String, Double>> entry:MobileDetails.cartItems.entrySet())
					{ 
						System.out.println(entry.getValue()); 
						
						//System.out.println(arrayList); 
						
					}
				}
			}
		}
	}
}
