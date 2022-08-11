package com.levelIIqstn;

import java.util.Scanner;

/*Given an array of integers, compute the maximum value for each integer in the index, by either summing all the digits or multiplying all the digits. (Choose which operation gives the maximum value)
•	Input:
•	5
•	120 24 71 10 59
•	Output:
•	3 8 8 1 45
Explanation: For index 0, the integer is 120. 
Summing the digits will give 3, and whereas Multiplying the digits gives 0. 
Thus, maximum of this two is 3.*/

public class MaxValBySumMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MaxValBySumMul().findMaxVal();
	}

	private void findMaxVal() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int len = sc.nextInt();
		int[] arr = new int[len];
		int[] result = new int[len];
		int index = 0;
		System.out.println("Enter the elements");
		for(int i=0;i<len;i++)
		{
			arr[index++] = sc.nextInt();
		}
		
		for(int i=0;i<len;i++)
		{
			int sum = 0;
			int mul = 1;
			int num = arr[i];
			int temp = num;
			while(temp!=0)
			{
				int rem = temp%10;
				sum = sum + rem;
				mul = mul * rem;
				temp = temp/10;
			}
			//System.out.println("sum  "+sum);
			//System.out.println("mul  "+mul);
			if(sum>mul)
				result[i] = sum; 
			else
				result[i] = mul;
			
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(result[i]);
		}
		
	}

}
