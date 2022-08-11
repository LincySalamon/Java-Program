package com.NandhaSan;

import java.util.Arrays;
import java.util.Scanner;

public class NumberRemoveandShift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int noOfElement = sc.nextInt();
		int [] arr = new int[noOfElement];
		System.out.println("Add elements to the array");
		for(int i=0;i<noOfElement;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to remove in a array");
		int removeEle = sc.nextInt();
	  
		for(int i=0;i<noOfElement;i++)
		{
			if(arr[i] == removeEle)
			{
				arr[i] = 1;
				for(int j=i-1; j>=0;j--)
				{
					if(arr[j]!=1) 
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
		
		for(int i=0;i<noOfElement;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
