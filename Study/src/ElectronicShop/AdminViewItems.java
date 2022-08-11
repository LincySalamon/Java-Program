package ElectronicShop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class AdminViewItems extends ListViwer{
	LinkedHashMap<Integer, String> BrandKeys = new LinkedHashMap<Integer, String>();
	
	public void viewItems(String name) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("Select which Item you want to view");
			int num =1;
			for(Entry<String, HashMap<String, Double>>   entry : DataList.mobileData.entrySet()) {
				System.out.println(num+". "+entry.getKey());
				BrandKeys.put(num++, entry.getKey());
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
				//listViwer(val,name);    
				break;
			} 
		}
	}

}
