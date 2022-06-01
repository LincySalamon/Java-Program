package com.MaheshSan;

import java.util.Scanner;

public class VowelsIfElse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
				ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch+" is vowel");
		else
			System.out.println(ch+" is consonant");
		}
		else
			System.out.println(ch+" is not an alphabet");
	}
}
