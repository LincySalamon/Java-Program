package com.BatchReference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DistinctWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		printDistinctWord(str);
	}
	private static void printDistinctWord(String str) {
		String[] words = str.split(" ");
		
		HashSet<String> uniqueWord = new LinkedHashSet<String>(Arrays.asList(words));
		
		for(String s:uniqueWord )
		{
			System.out.println(s);
		}
		/*for(int i=0;i<words.length;i++)
		{
			System.out.print(words[i]+"\n");
		}*/
	}
}
