package com.SathisKumarSan;

import java.util.Scanner;

public class RomanInteger {

	public void convertRomanInt(String str) {
		int len = str.length();
		int num[] = new int[len];
		for(int i=0;i<len;i++)
		{
			switch (str.charAt(i)){
			case 'M': { num[i] = 1000; break; }
			case 'D': { num[i] = 500; break; }
			case 'C': { num[i] = 100; break; }
			case 'L': { num[i] = 50; break; }
			case 'X': { num[i] = 10; break; }
			case 'V': { num[i] = 5; break; }
			case 'I': { num[i] = 1; break; }
			}
		}
		int sum = 0;
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i] < num[i+1])
			{
				sum -= num[i];
			}
			else {
				sum += num[i];
			}   
		}
		System.out.println(sum+num[len-1]);  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the roman value");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		new RomanInteger().convertRomanInt(str); 
	}

}
