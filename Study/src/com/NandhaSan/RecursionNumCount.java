package com.NandhaSan;

public class RecursionNumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int sum = addNum(num);
		System.out.println(sum);
	}

	private static int addNum(int num) {
		// TODO Auto-generated method stub
		if(num !=0)
		{
			System.out.println(num);
			return num+addNum(num-1);
		}
		else
			return num;
	}

}
