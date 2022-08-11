package com.HackerRank;

import java.util.ArrayList;
import java.util.Collections;

public class SalesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SalesByMatch().findMatchSocks();
	}

	private void findMatchSocks() {
		// TODO Auto-generated method stub
		int len = 9;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);ar.add(20);ar.add(20);ar.add(10);ar.add(10);
		ar.add(30);ar.add(50);ar.add(10);ar.add(20);
		Collections.sort(ar);
		System.out.println(ar);
		int count =0;
		for(int i=0;i<ar.size()-1;i++)
		{
			for(int j=1;j<ar.size();j++)
			{
				if(ar.get(i)==ar.get(j))  
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
