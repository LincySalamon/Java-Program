package com.interview;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		new LongestSubstring().findCommonSubString();
	}

	private void findCommonSubString() {
//		String[] words = new String[]{"plateau","template","electroplated"};
//		int len = words.length;
//		String searchWord = "plate";
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int num = sc.nextInt();
		int index = 0;
		System.out.println("Enter the array elements");
		String[] words = new String[num];
		
		while(index<num)
		{
			words[index++] = sc.next();
		}
		//printArray(words);
		System.out.println("Enter the search word");
		sc.nextLine();
		String searchWord = sc.nextLine();
		
		if(searchWord.length()<3)
		{
			System.out.println("Enter a search word atleast 3 character");
		} 
		
		if(searchWord.length()>=3 && findSubString(words,searchWord))
			System.out.println(searchWord+"  present in all the array element");
		if(!findSubString(words,searchWord))
			System.out.println("("+")");
	}

	private boolean findSubString(String[] words, String searchWord) {
		int len = words.length;
		int count =0;
		for(int i=0;i<len;i++)
		{
			String word = words[i];
			if(word.indexOf(searchWord)!= -1)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if(count == len)
		{
			return true;
		}
		return false;
	}

	private void printArray(String[] words) {
		for(int i=0;i<words.length;i++)
		{
			System.out.print(words[i]+"   ");
		}
	}

}
