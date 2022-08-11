package com.quardraticequation;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] input = new String[] {"apple","april","ape"};//{"geeksforgeeks", "geeks", "geek", "geezer"};
		//{apple,april,ape}
		String prefix = new CommonPrefix().fidCommonPrefix(input);
		System.out.println(prefix);
	}

	private String fidCommonPrefix(String[] input) {
		int len = input.length;
		if(len == 0)
			return "";
		if(len == 1)
			return input[0];
		System.out.println("sorted array");
		Arrays.sort(input);
		for(int i=0;i<len;i++)
			System.out.print(input[i]+"  ");
		System.out.println();
		
		int end = Math.min(input[0].length() , input[len-1].length());
		System.out.println(end);
		
		int i=0;
		while(i<end && input[0].charAt(i) == input[len-1].charAt(i))
		{
			i++; 
		}
		String prefix = input[0].substring(0,i); 
		
		if(prefix.length()>3)
			return prefix;
		return "()";
	}

}
