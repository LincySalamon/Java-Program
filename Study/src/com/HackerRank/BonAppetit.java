package com.HackerRank;

import java.util.ArrayList;

public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BonAppetit().calculateAppetit();
	}

	private void calculateAppetit() {
		// TODO Auto-generated method stub
		int len = 4;int annaDoestEat = 1;
		int shareAmnt = 7;
		ArrayList<Integer> bill = new ArrayList<Integer>();
		bill.add(3);bill.add(10);bill.add(2); bill.add(9);
		
		int totalAmount = 0,individualAmnt = 0;
        for(int i=0;i<bill.size();i++)
        {
            if(bill.get(i) != bill.get(annaDoestEat))
            {
                totalAmount += bill.get(i);
            }
        }
        individualAmnt = totalAmount/2;
        if(individualAmnt == shareAmnt)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            int returnAmnt = shareAmnt-individualAmnt;
            System.out.println(returnAmnt);
        }
	}

}
