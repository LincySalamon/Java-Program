package com.lIIpreperation;

public class RemovePalindrome {

	public static void main(String[] args) {
		new RemovePalindrome().removePalindrome();
	}

	private void removePalindrome() {
		String str = "Hari speaks malayalam";//"He did a good deed";
		
		String val = "";
		String[] arr = str.split(" "); 

		for(int i=0;i<arr.length;i++)
		{
			String word = arr[i];
			int len = word.length();
			String reverse = "";
			
			for(int j = len -1;j>=0;j--)
			{
				reverse += word.charAt(j); 
			}
			 //System.out.println(reverse); 
			if(word.equals(reverse)) {
				continue;
			}
			
			else {
				val += word+" ";
			}
		}
		System.out.println(val);
	}

}
