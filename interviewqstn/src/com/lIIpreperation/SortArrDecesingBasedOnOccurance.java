package com.lIIpreperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//output  3 3 3 3 2 2 2 12 12 4 5
public class SortArrDecesingBasedOnOccurance {

	public static void main(String[] args) {
		int[] arr = new int[] {2,2,3,4,5,12,3,3,3,12};
		//ArrayList<Integer> arr = new ArrayList<Integer>(); 
		int len = arr.length;
		
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(count.containsKey(arr[i]))
			{
				//System.out.println(count.get(arr[i]));
				count.put(arr[i], count.get(arr[i])+1);
			}
			else {
				count.put(arr[i], 1);
			}
		}
		System.out.println(count); 
		Collections.sort(null);
	}

}  
