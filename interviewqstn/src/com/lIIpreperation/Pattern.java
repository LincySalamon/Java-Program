package com.lIIpreperation;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		new Pattern().printPattern();
	}

	private void printPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int num = sc.nextInt();
		sc.close();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--)
			{
				System.out.print(k);
			}
			for(int l=1;l<=i;l++) 
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
