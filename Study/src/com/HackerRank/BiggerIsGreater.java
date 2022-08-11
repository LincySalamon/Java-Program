package com.HackerRank;

public class BiggerIsGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdc";
		char[] ch = str.toCharArray();
		int len = ch.length;
		int position = len-1;
		for(int i=position;i>=0;i--)
		{
			if(ch[i] > ch[i-1] && position > 0)
			{
				break;
			}
			
		}
	}

}
