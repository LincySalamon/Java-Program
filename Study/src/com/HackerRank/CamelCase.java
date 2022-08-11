package com.HackerRank;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "saveChangesInTheEditor";
		int count = 0;
        for(int i=0;i<s.length();i++)
        {
        	if(Character.isUpperCase(s.charAt(i)))
        	{
        		count++;
        	}
        }
        System.out.println(count+1);
	}

}
