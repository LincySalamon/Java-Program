package com.interview;

import java.util.ArrayList;
import java.util.Scanner;

public class LongCommonSubString {

	public static void main(String[] args) {
		new LongCommonSubString().commonSubstring();
	}

	private void commonSubstring() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int num = sc.nextInt();
		int index = 0;
		System.out.println("Enter the array elements");
		String[] words = new String[num];
		ArrayList<String> result = new ArrayList<String>();
		
		while(index<num)
		{
			words[index++] = sc.next();
		}
		for(int i=1;i<num;i++)
		{
			String str = words[i];
			result.add(findSubString(words[0],words[i]));
			//System.out.println(result);
		}
		String val = result.get(0);
		int count =0;int min = 0;
		for(int i=0;i<result.size();i++)
		{
			String resVal = result.get(i);
			
			if(min < result.get(i).length())
			{
				min = result.get(i).length();
				val = result.get(i);
			}
			else {
				min = result.get(i).length();
				val = result.get(i);
			}
			
		}
		
		if(val!=null)
		{ 
			System.out.println(val);
		}
		else {
			System.out.println("There is no common element in array");
		}
	}

	private String findSubString(String string, String string2) {
		int len1 = string.length();
		int len2 = string2.length();
		int max = 0;
		int[][] count = new int[len1][len2];
		int endIndex = 1;
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2;j++)
			{
				if(string.charAt(i) == string2.charAt(j))
				{
					if(i==0 || j==0)
					{
						count[i][j] = 1;
					}
					else {
						count[i][j] = count[i-1][j-1]+1;
					}
					if(max < count[i][j])
					{
						max = count[i][j];
						endIndex = i;
					}
				}
			}
		}
		//System.out.println((endIndex-max+1)+"endindex     "+(endIndex+1));
		return string.substring(endIndex-max+1,endIndex+1); 
		
	}

}
