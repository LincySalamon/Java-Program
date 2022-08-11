package com.lIIpreperation;

import java.util.Scanner;

public class DivideBy7 {

	public static void main(String[] args) {
		new DivideBy7().findDivideBy7Num();
	}

	private void findDivideBy7Num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		int tempVal = num;
		int lastDigit = num % 10;
		int remainDigit = num/10;
		//System.out.println(lastDigit+"   "+remainDigit);
		int checknum = remainDigit-(lastDigit*2);
		//System.out.println(checknum);
		if(checknum % 7 == 0)
			System.out.println(num+" Number is divide by 7");
		else
			System.out.println(num+" Number is not divide by 7");
		
//		int arr[] = new int[-10];
//		arr[0] = 9;
//		System.out.println(arr[0]);
	}

}
