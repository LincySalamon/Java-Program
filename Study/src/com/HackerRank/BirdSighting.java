package com.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirdSighting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);arr.add(1);arr.add(2);arr.add(3);arr.add(2);arr.add(4);
		//Collections.sort(arr); 
		//System.out.println(arr);
		int len = arr.size();
		int max=-1;//because 0 is the least element so we take -1
		int id=-1;
			/*for(int i=0;i<len;i++)
			{
				if(arr.get(i)>max) {
					max = arr.get(i);
					id += 1;
				}   
			}*/
		int[] countBirdSight = new int[len+1]; 
			/*for(int i=0;i<len+1;i++) {
			System.out.print(countBirdSight[i]);
			}*/
		for(int i=0;i<len;i++)
		{
			countBirdSight[arr.get(i)]++;
		}
		for(int i=0;i<len+1;i++)
		{
			if(countBirdSight[i] > max)
			{
				max = countBirdSight[i];
				id = i;
			}
		}
		System.out.println(id);
	}

}
