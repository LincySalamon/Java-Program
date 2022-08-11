package com.levelIIqstn;

import java.util.Scanner;
/*A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime number.
Input : 97
Output : Twisted Prime Number
Explanation: 97 is a prime number
and its reverse 79 is also a prime
number.*/

public class TwistedPrimeNumber {
	private void findTwistedPrimeNum() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0;
		
		boolean isPrime = findPrime(num);
		
		if(isPrime == true) {
			//System.out.println(num+"    "+temp+"    "+number);
			while(temp>0)
			{
				int rem = temp%10;
				sum = (sum * 10)+ rem;
				temp = temp/10;
			}
			findPrime(sum);
		}
	}
	public boolean findPrime(int num) {
		int temp = num;
		int mid = temp/2;
		int flag = 0;
		boolean isPrime = false;
		for(int i=2;i<=mid;i++)
		{
			if(temp%i == 0) 
			{
				flag = 1;
				break; 
			}
		}
		if(flag != 0)
			System.out.println(num+ " is not a prime number");
		else {
			System.out.println(num+ " is a prime Number");
			isPrime = true;
		}
		return isPrime; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TwistedPrimeNumber().findTwistedPrimeNum();
	}

}
