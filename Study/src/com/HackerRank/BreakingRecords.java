package com.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BreakingRecords().findRecords();
	}

	private void findRecords() {
		// TODO Auto-generated method stub
		int len = 10;
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(3);scores.add(4);scores.add(21);
		scores.add(36);scores.add(10);scores.add(28);
		scores.add(35);scores.add(5);scores.add(24);scores.add(42);
		 
		ArrayList<Integer> result = new ArrayList<>();
	        int maxRecord = 0;
	        int minRecord = 0;
	        int highestRecord = scores.get(0);
	        int lowestRecord = scores.get(0);
	        for(int i=1;i<scores.size();i++)
	        {
	            if(highestRecord < scores.get(i))
	            {
	                highestRecord = scores.get(i);
	                maxRecord++;
	            }
	            if(lowestRecord > scores.get(i))
	            {
	                lowestRecord = scores.get(i);
	                minRecord++;
	            }
	        }
	        result.add(maxRecord);
	        result.add(minRecord);
	        System.out.println(result);
	}

}
