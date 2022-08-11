package com.HackerRank;

public class InfiniteStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aba";
		long n = 10;
		int len = str.length();
		long num = n/(str.length());
		long rem = n%(str.length());
		//System.out.println(num);
		long ans = 0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i) == 'a')
			{
				ans += num;
				if(i<rem)
					ans++;
			}
		}
		System.out.println(ans);
	}
}
