package com.HackerRank;

public class SperateNumber {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "99910001001";//91011  99910001001
		int len = s.length();
		String subStr = "";
		boolean valid = false;
		long firstNum = 0l;
		for(int i=1;i<=len/2;i++)
		{
			subStr = s.substring(0, i); 
			//System.out.println(subStr);
			Long num = Long.parseLong(subStr); 
			firstNum = num;
			//System.out.println(num);
			String validStr = subStr;     
			while(validStr.length() < s.length())
			{
				validStr += Long.toString(++num);
				System.out.print(validStr+"\t");
			}
			if(s.equals(validStr))
			{
				valid = true; 
				break;
			}
		}
		if(valid == true)
			System.out.println("yes "+firstNum);
		else
			System.out.println("No");
	}

}
