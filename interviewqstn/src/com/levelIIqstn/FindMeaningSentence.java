package com.levelIIqstn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Problem Statement : Given a sequence of characters, find a meaningful sentence using the dictionary 
 * of words given. 
Input: Consider the following dictionary
{"i", "like", "zoho", "corporation", "rat", "on" ,"or", "ration", "a"}
Input:  ilike
Output: i like*/

public class FindMeaningSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindMeaningSentence().findMeaningfulSent();
	}

	private void findMeaningfulSent() {
		// TODO Auto-generated method stub
		String temp_dictionary[] = {"i", "like", "zoho", "corporation", "rat", "on" ,"or", "ration", "a"};
		
		List<String> dictionary = new ArrayList<String>();
		
		for(String s : temp_dictionary)
		{
			dictionary.add(s);
		}
		//System.out.println(dictionary);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string present in an following array");
		System.out.println(dictionary);
		String inputString = sc.nextLine();
		
		boolean[] dp = new boolean[inputString.length() + 1];
		dp[0] = true;
		
		for(int i=0;i<=inputString.length();i++)
		{
			for(int j=i;j<i;j++)
			{
				System.out.println(inputString.substring(j,i));
				if(dictionary.contains(inputString.substring(j,i)))
				{
					dp[i] = true;
					break;
				}
			}
		}
		//System.out.println(dp[inputString.length()]);
		for(int i=0;i<dp.length;i++) {
			System.out.println(dp[i]);
		}
	}

}
