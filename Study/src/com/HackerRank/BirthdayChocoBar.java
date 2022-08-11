package com.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocoBar {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(4);//s.add(2);s.add(1);s.add(3);s.add(2);
		System.out.println(s);
		int d=4,m=1,result=0;
		int len = s.size();
		for(int i=0;i<len-m+1;i++) 
		{
			int tempSum = 0;
			for(int j=i;j<i+m;j++)
			{
				tempSum += s.get(j);
			}
			if(tempSum == d)
				result++;
		}
		System.out.println(result);
	}

}
