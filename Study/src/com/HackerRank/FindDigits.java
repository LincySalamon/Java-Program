package com.HackerRank;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1012;
		int temp = n;
		int count = 0;
		while(temp!=0)
		{
			int rem = temp%10;
			if(n%rem == 0)
				count++;
			temp = temp/10;
		}
		System.out.println(count);
	}

}
