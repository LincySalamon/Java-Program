package com.levelIIqstn;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		new Palindrome().findPalindrome();
	}

	private void findPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum =0;
		
		while(temp>0)
		{
			int rem = temp%10;
			sum = (sum * 10)+ rem; 
			temp = temp/10;
		}
		System.out.println(sum);
		if(sum == num)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}

}
