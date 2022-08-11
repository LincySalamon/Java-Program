package com.HackerRank;

public class AlternatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAABBB";
		char[] ch = str.toCharArray();
		int len = ch.length;
		int count = 0;
		for(int i=0;i<len-1;i++)
		{
			if(!(ch[i] == ch[i+1]))
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
