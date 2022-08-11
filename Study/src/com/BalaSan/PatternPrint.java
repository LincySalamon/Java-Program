package com.BalaSan;

import java.util.Scanner;


public class PatternPrint {
	public void patternResult()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		//int n=5;
		sc.close();
		for(int i=0;i<n;i++) 
		{ 
			if(i==0 || i==n-1)
			{
				for(int k=0;k<n;k++)
				{
					System.out.print("!");
				}
				System.out.println();
			}
			else
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(" ");
				}
				System.out.println("!");
			}
		}
	}
	public static void main(String[] args) {
		PatternPrint prObj = new PatternPrint();
		prObj.patternResult();
	}
}
