package com.SathisKumarSan;

import java.util.Arrays;
import java.util.Scanner;

public class XORArr {

	private void findMaxXORVal() {
		int[] arr = new int[] {3,10,5,25,2,8};
		int len = arr.length;
		int[] result = new int[len];
		
		int index=0;
		for(int i=0;i<len-1;i++)
		{
			result[index++] = arr[i]^arr[i+1];
		}
		Arrays.sort(result);
		System.out.println(result[result.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new XORArr().findMaxXORVal();
	}
}
