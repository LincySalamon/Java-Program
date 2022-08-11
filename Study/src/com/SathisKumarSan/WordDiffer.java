package com.SathisKumarSan;

import java.util.Scanner;

//words Diff? You are given two words. 
//Find out the difference by outputting the characters 
//that are not present in the one but not in the other word. 
//Example: “Something”, “else” output: ”omthing"

public class WordDiffer {

	private void differWordInString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		String result = "";
		
		if(str1.equals(str2))
			System.out.println("Two strings are same value, there is no difference in it");
		
		else {
			for(int i=0;i<ch1.length;i++)//something else
			{
				if(!str2.contains(""+ch1[i]))     
				{  
					result = result+ch1[i];  
				}
			}
		}
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordDiffer().differWordInString();
	}
}
