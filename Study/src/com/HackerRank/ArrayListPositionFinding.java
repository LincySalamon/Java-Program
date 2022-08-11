package com.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPositionFinding {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number:");
        int num = sc.nextInt();
        ArrayList<List<Integer>> numList = new ArrayList<List<Integer>>();
        
        for(int i=0;i<num;i++)
        {
        	int len = sc.nextInt();
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	while(len-- > 0)
        	{
        		list.add(sc.nextInt());
        	}
        	numList.add(list);
        }
        System.out.println("Enter nnumber to find position:");
        int l = sc.nextInt();
        while(l-- > 0)
        {
        	int line = sc.nextInt()-1;
        	int position = sc.nextInt()-1;
        	if(line >= numList.size())
        	{
        		System.out.println("ERROR!");
        	}
        	else if(position >= numList.get(line).size())
        	{
        		System.out.println("ERROR!");
        	}
        	else {
        		System.out.println(numList.get(line).get(position));
        	}
        }
	 }
}
