package ElectronicShop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DataList  {
	
	protected static LinkedHashMap<String, HashMap<String, Double>> mobileData = new LinkedHashMap<String, HashMap<String,Double>>();
	protected static LinkedHashMap<String, HashMap<String, Double>> laptopData = new LinkedHashMap<String, HashMap<String,Double>>();
	 


	public  void mobileList() {
		LinkedHashMap<String, Double> brandList = new LinkedHashMap<String, Double>();
		LinkedHashMap<String, Double> brandList1 = new LinkedHashMap<String, Double>();
		LinkedHashMap<String, Double> brandList2 = new LinkedHashMap<String, Double>();
		brandList.put("SE", 25000.00);  
		brandList.put("APPLE 8", 55000.00);   
		brandList.put("APPLE 11", 85000.00);
		DataList.mobileData.put("APPLE", brandList);
		brandList1.put("NORD", 30000.00); 
		brandList1.put("ONE PLUS 5T", 55000.00);
		brandList1.put("ONE PLUS 8T", 95000.00);
		DataList.mobileData.put("ONE PLUS", brandList1);  
		brandList2.put("NOTE 10", 30000.00);
		brandList2.put("GALAXY S8", 55000.00); 
		brandList2.put("GALAXY S10", 100000.00); 
		DataList.mobileData.put("SAMSUNG", brandList2);
	}
	public  void laptopList() {
		LinkedHashMap<String, Double> brandList = new LinkedHashMap<String, Double>();
		LinkedHashMap<String, Double> brandList1 = new LinkedHashMap<String, Double>();
		LinkedHashMap<String, Double> brandList2 = new LinkedHashMap<String, Double>();
		brandList.put("MAC book 10", 200000.00);  
		brandList.put("MAC BOOK PRO",255000.00);   
		brandList.put("MAC 10", 185000.00);
		DataList.laptopData.put("MAC", brandList);
		brandList1.put("Latitude", 30000.00); 
		brandList1.put("Vostro", 55000.00);
		brandList1.put("XPS 15", 255000.00); 
		DataList.laptopData.put("DELL", brandList1);
		brandList2.put("Zen Book", 70000.00);
		brandList2.put("Zen Book Flip", 100000.00);
		brandList2.put("Zen Book Pro", 200000.00); 
		DataList.laptopData.put("ASUS", brandList2);
	}

}
