package com.lIIpreperation;

import java.util.Scanner;

public class ZeckendorfTheorem {
	
	public static void main(String[] args) {
		new ZeckendorfTheorem().findNumbers();
	}

	private void findNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		
		printFibNumber(num);
	}

	private void printFibNumber(int num) {
		while(num > 0)
		{
			int f = nearestFibanacciNum(num);
			System.out.print(f+" + ");
			num = num-f;
		}
		
	}
 
	private int nearestFibanacciNum(int num) {
		if(num == 0 || num == 1)
			return num;
		int f1 = 0,f2 = 1,f3 = 1;
		while(f3<=num) {
			f1 = f2;
			f2 = f3;
			f3 = f1+f2;
		}
		return f2;
	}

}
