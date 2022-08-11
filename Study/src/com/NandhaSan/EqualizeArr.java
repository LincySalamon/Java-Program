package com.NandhaSan;

import java.util.ArrayList;
import java.util.List;

public class EqualizeArr {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>(); 
		arr.add(3);arr.add(3);arr.add(2);arr.add(1);arr.add(3);
		 int len = arr.size();
		 int[] tempArr = new int[len/2];
	        int max_count = 0;
	        int k=0;
	        for(int i=0;i<len;i++)
	        {
	        	
	            int count = 0;
	            for(int j=i+1;j<len;j++)
	            {
	                if(arr.get(i) == arr.get(j))
	                {
	                    count++;   
	                }
	                if(max_count<count)
	                    max_count = count;
	            }
	            tempArr[k] = arr.get(i);
	            k++;
	        }
	       System.out.println(max_count);
	}
}