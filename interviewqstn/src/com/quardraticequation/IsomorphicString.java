package com.quardraticequation;

import java.util.Scanner;

public class IsomorphicString {
	static final int TOTALCHAR = 26;
	public static void main(String[] args) {
		new IsomorphicString().checkIsomorphic();
	}

	private void checkIsomorphic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2 = sc.nextLine();
		sc.close();
		int n = str1.length();
		int m = str2.length();
		if(n!=m)
		{
			System.out.println("0");
		}
		int[] charcount1 = new int[TOTALCHAR];
		int[] charcount2 = new int[TOTALCHAR];
		
		for(int i=0;i<n;i++)
		{
			charcount1[str1.charAt(i)-'a']++;
			charcount2[str2.charAt(i)-'a']++;
		}
		
		for(int i=0;i<n;i++)
		{
			if(charcount1[str1.charAt(i)-'a'] != charcount2[str2.charAt(i)-'a'])
			{
				System.out.println("0");
				break;
			}
		}
		System.out.println("1");
	}

}
