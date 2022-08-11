package com.lIIpreperation;

public class NextImmediatePalindrome {

	public static void main(String[] args) {
		new NextImmediatePalindrome().findImmediatePalindrom();
	}

	private void findImmediatePalindrom() {
		int num = 808;
		int count = 0;

		int i=num+1;
		
		do { 
			int sum = 0;
			int temp = i;
			while(temp>0)
			{
				int rem = temp%10;
				sum = (sum * 10)+ rem;
				temp = temp/10; 
			}
			if(sum == i)
			{
				count=1; 
				break;
			}
			i++;
		}while(count != 1);   
		
		if(count == 1)
			System.out.println(i);  
	}

}
