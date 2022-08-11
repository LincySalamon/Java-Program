package com.interview;

import java.util.ArrayList;

public class EliminatingNumber {

	public static void main(String[] args) {
		new EliminatingNumber().findEliminatingNumber();
	}

	private void findEliminatingNumber() {
		int n = 6;
		int x = 3;
		ArrayList<Integer> val = new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			val.add(i);
		}
		System.out.println(val);
		for(int i=0;i<n;i++)
		{
			if(i==(x-1))
			{
				val.remove(i);
				System.out.println(i);
				int last = val.size()-1;
				
				for(int j=val.size()-1;j>0;j--)
				{
					int temp = val.get(j-1);
					val.add(i,temp);
				}
				val.add(0,last);
			}
		}
		System.out.println(val);
	}

}
