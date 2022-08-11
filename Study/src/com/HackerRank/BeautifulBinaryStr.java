package com.HackerRank;

public class BeautifulBinaryStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b = "0101010";
		int len = b.length();
        int i=0;
        int ans =0;
        while(i<len-2)
        {
            if(b.substring(i, i+3).equals("010"))
            {
                ans++;
                i+=3;
                continue;
            }
            i++;
        }
        System.out.println(ans);
	}

}
