package com.interview;

import java.util.ArrayList;

public class SubString {

	public static void main(String[] args) {
		new SubString().findLongestSubString();
	}

	private void findLongestSubString() {
		String[] words = new String[]{"plateau","template","electroplated"};
		int len = words.length;
		
		String word = words[0];
		String word1 = words[1];
		int ans =0;
		ArrayList<Character> ch = new ArrayList<>();
		int index = 0;
		
		for (int i=0;i<word.length();i++) 
		{
	        for (int j=0;j<word1.length();j++) 
	        {
				int k = 0;
				while ((i + k)<word.length() && (j + k)<word1.length() && word.charAt(i + k)==word1.charAt(j + k)) 
				{
					ch.add(word.charAt(k));
					k = k + 1;
				}
				ans = Math.max(ans,k); 
		   }
		}
		System.out.println(ch);
		System.out.println(ans);
	}

}
