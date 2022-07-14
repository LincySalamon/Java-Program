package com.mockinterview;

import java.util.Arrays;  
public class Anagram
{
    public static void main(String[] args) {
    	new Anagram().findIsAnagram();
    }

	private void findIsAnagram() {
		// TODO Auto-generated method stub
		String str1 = "Listen";
        String str2 = "Silent";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        if(ch1.length != ch2.length)
        {
            System.out.println("Both Strings are not anagram");
        }
        else
        {
        	ch1 = sortChArr(ch1);
            ch2 = sortChArr(ch2);
            
            if(Arrays.equals(ch1,ch2) == true)
            {
                System.out.println("Both Strings are anagram");
            }
            else{
                System.out.println("Both Strings are not anagram");
            }
        }
	}

	private char[] sortChArr(char[] ch1) {
		// TODO Auto-generated method stub
		char temp; int i=0;
    	while(i<ch1.length)
    	{
    		int j=i+1;
    		while(j<ch1.length)
    		{
    			if(ch1[j] < ch1[i])
    			{
    				temp = ch1[i];
    				ch1[i] = ch1[j];
    				ch1[j] = temp;
    			}
    			j = j+1;
    		}
    		i = i+1;
    	}
    	return ch1; 
	}
}
