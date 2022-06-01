package com.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NonDivisibleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = new ArrayList<Integer>();
		s.add(19);s.add(10);s.add(12);s.add(10);s.add(24);s.add(25);s.add(22);
		//System.out.println(s);
		int k =4;	
		int[] m = new int[s.size()];
		for(Integer i:s)
		{
			m[i%k] +=1;
		}
		int ans =0;
		if(m[0]>0)
			ans++;
		for(int i=1;i<k;i++)
		{
			if(m[i] == 0)continue;
			if(i+1 == k)
			{
				ans++;
			}
			else {
				ans += max(m[i],m[k-i]);
				m[i] = 0;
				m[k-i] = 0;
			}
		}
		System.out.println(ans);
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		int maxVal = (i>j)?i:j;
		System.out.println(maxVal);
		return maxVal;
	}

}
