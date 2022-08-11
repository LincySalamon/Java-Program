package com.levelIIqstn;

import java.util.Scanner;

/*Given an array of integers, replace every element with the next 
greatest element (greatest element on the right side) in the array. 
Since there is no element next to the last element, replace it with -1. 
For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be 
modified to {17, 5, 5, 5, 2, -1}.*/

public class ReplaceWithGreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReplaceWithGreatestNum().replaceNum();
	}

	private void replaceNum() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in an array: ");
		int len = sc.nextInt();
		System.out.println("Enter the element in an array");
		int[] num = new int[len];
		int index =0;
		for(int i=0;i<len;i++)
		{
			num[index++] = sc.nextInt();
		}
		
		for(int i=0;i<len-1;i++)
		{
			if(num[i] < num[i+1])
			{ 
				num[i] = num[i+1];
				num[i+1] = -1;
				
				for(int j=i;j>0;j--)  
				{
					if(num[j-1]<num[i]) 
					{ 
						num[j-1] = num[i];
					}
				}
			}
		}
		System.out.println("Number replace with greatest number");
		for(int i=0;i<len;i++)
		{
			System.out.println(num[i]);
		}
	}

}
