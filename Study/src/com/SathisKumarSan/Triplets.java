package com.SathisKumarSan;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.Example:Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]


public class Triplets {
	public void tripletFind() {
		int[] num = new int[]{-1,0,1,2,-1,-4};
		int sum =0;
		int len = num.length;
		
		for(int i=0; i<len-2; i++) 
		{
			for(int j=i+1;j<len-1;j++)
			{
				for(int k=j+1;k<len;k++)
				{
					if(num[i]+num[j]+num[k] == sum)
					{
						System.out.println("["+num[i]+","+num[j]+","+num[k]+"]"); 
					}
				} 
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triplets tp = new Triplets();
		tp.tripletFind();
	}

}
