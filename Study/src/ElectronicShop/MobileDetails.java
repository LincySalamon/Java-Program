package ElectronicShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class MobileDetails extends ListViwer {
	
	protected static LinkedHashMap<String, HashMap<String, Double>> cartItems = new LinkedHashMap<String, HashMap<String,Double>>();
	LinkedHashMap<Integer, String> BrandKeys = new LinkedHashMap<Integer, String>();
	
	public void mobileDetails(String name,String item) {
		Scanner sc = new Scanner(System.in);  
		boolean isTrue = true;
		
		while(isTrue)
		{
			System.out.println("Choose Which Brand You want");
			int num =1;  
			if(item == "MOBILE")
			{
				for(Entry<String, HashMap<String, Double>>   entry : DataList.mobileData.entrySet()) {
					System.out.println(num+". "+entry.getKey());
					BrandKeys.put(num++, entry.getKey());
				}
			}
			if(item == "LAPTOP")
			{
				for(Entry<String, HashMap<String, Double>>   entry : DataList.laptopData.entrySet()) {
					System.out.println(num+". "+entry.getKey());
					BrandKeys.put(num++, entry.getKey());
				}
			}
			System.out.println("100.Back to Item Menu");
			byte choice = sc.nextByte();
			
			if(choice == 100)
			{
				isTrue = false;
				break;
			}
			else {
				String val = BrandKeys.get((int)choice);
				System.out.println(val);
				listViwer(val,name,item);         
			} 
		}
	
	}

}
