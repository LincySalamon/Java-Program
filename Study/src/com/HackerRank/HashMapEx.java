package com.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,HashMap<String, Double>> models = new HashMap<String,HashMap<String, Double>>();
		HashMap<String, Double> itemDes = new HashMap<String, Double>();
		itemDes.put("SE", 30000.00);
		itemDes.put("8 PLUS", 45000.00);
		itemDes.put("11", 70000.00); 
		itemDes.put("13", 90000.00); 
		models.put("Apple", itemDes);
		
		HashMap<String, Double> itemDes1 = new HashMap<String, Double>();
		itemDes1.put("Nord", 40000.00);
		itemDes1.put("12", 46000.00);
		itemDes1.put("Nord plus", 60000.00); 
		itemDes1.put("15", 70000.00); 
		models.put("One Plus", itemDes1);
		
		for(Entry<String,HashMap<String, Double>> entry : models.entrySet())
		{
			for(Entry<String, Double> entry1 : itemDes.entrySet())
			{
				//System.out.println(entry);
				System.out.println(entry.getKey()+"  "+entry1.getKey()+"   "+entry1.getValue());
		
			}
		}
	
	}

}
