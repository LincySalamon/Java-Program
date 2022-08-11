package com.HackerRank;

public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabccddd";
		StringBuilder sb = new  StringBuilder(str);
		String s = "";
		//int len = sb.length();
		//System.out.println(len);
		for(int i=0;i<sb.length()-1;i++)
		{
			if(sb.charAt(i) == sb.charAt(i+1))
			{
				sb.delete(i, i+2);
				System.out.println(sb);
			}
		}
	}

}
