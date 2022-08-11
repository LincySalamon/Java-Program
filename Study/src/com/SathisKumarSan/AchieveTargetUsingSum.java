package com.SathisKumarSan;

import java.util.Scanner;

public class AchieveTargetUsingSum {
	private void findIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements in an array:");
		int len = sc.nextInt();
		
		System.out.println("Enter the value of Array:");
		int arr[] = new int[len];
		int index =0;
		for(int i=0;i<len;i++)
		{
			arr[index++] = sc.nextInt();
		}
		System.out.println("Enter the target value:");
		int target = sc.nextInt();
		
		for(int i=0;i<len-1;i++)
		{
			int val = arr[i]+arr[i+1];
			if(val == target)
			{
				System.out.println(i+"  "+(i+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AchieveTargetUsingSum().findIndex();
	}
}
