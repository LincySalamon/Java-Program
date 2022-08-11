package com.HackerRank;

import java.util.ArrayList;

public class StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abab";
		int len = str.length();
        char[] ch = str.toCharArray();
        ArrayList<Character> p = new ArrayList<Character>();
        p.add(ch[0]);
        int i=1;
        int costDollar =1;
        while(i<len)
        {
            if(p.contains(ch[i]))
                i++;
            else{
                p.add(ch[i]);
                costDollar++;
                i++;
            }
        }
        System.out.println(costDollar);
	}

}
