package com.quardraticequation;


public class ReverseStringWithOutChangeSpecialCh {

	public static void main(String[] args) {
		new ReverseStringWithOutChangeSpecialCh().reverseString();
	}

	private void reverseString() {
		String str = "house no : 123@ cbe";
		int len = str.length();   
		int start = 0;
		int end = len-1;
		char[] chArr = str.toCharArray();
		while(start < end)
		{
			if(chArr[start] == ' ' || chArr[start] == '@' || chArr[start] == ':')
			{
				start++;
				continue;
			}
			else if(chArr[end] == ' ' || chArr[end] == '@' || chArr[end] == ':')
			{
				end--;
				continue;
			}
			else {
				char temp = chArr[start];
				chArr[start] = chArr[end];
				chArr[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(chArr));
	}

}
