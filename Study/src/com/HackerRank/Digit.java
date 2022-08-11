package com.HackerRank;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 99;
		int sq = p * p;System.out.println(sq);
		int digit = 0,sqVal=0,sum=0;
		int tempSq = sq;
		while(sq>0)
		{
			digit++;
			sq = sq/10;
		}
		//System.out.println(digit);
		sqVal =(int) Math.pow(10, (digit/2));
		//System.out.println(sqVal); 
		while(tempSq>0)
		{
			sum += tempSq%sqVal;
			tempSq /= sqVal;
		}
		if(sum == p)
			System.out.println("It is a kaprekar number");
		else
			System.out.println("It's not a kaprekar number");
	}

}
