package com.BalaSan;

import java.util.Scanner;

public class ZReversePrint {
	public void patternResult()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		//int n=5;
		sc.close();
		
		for(int i=0;i<n;i++) 
		{ 
			for(int j=0;j<n;j++)   
			{ 
				if(i==0 || i==n-1 || i==j)
					System.out.print("!");
				else
					System.out.print(" ");
			}  
			System.out.println();
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ZReversePrint().patternResult();
	}

}
