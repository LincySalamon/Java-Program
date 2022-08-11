package com.SathisKumarSan;

import java.util.Scanner;
import java.util.TreeMap;

public class IntegerRoman {
	
	public void convertInttoRoman() {
		String romans[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		int value[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
		//int letterSize = romans.length;
		int valSize = value.length-1;
		String ans = "";
		int num = 91;
		while(num>0)
		{
			while(value[valSize] <= num) 
			{
				ans += romans[valSize];
				//System.out.print(ans+"  ");
				num -= value[valSize];
				//System.out.println(num+"   ");
			}
			valSize--;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IntegerRoman().convertInttoRoman();
	}

}
