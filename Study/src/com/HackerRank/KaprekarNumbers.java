package com.HackerRank;

public class KaprekarNumbers {
	public void kaprekarNum() {
		
		int q = 100;
		for(int p =1;p<=q;p++)
		{
			if(p==1)
				System.out.print(p);
			int sq = p*p;
			int temSq = sq;
			int digitCount =0;
			int sum =0;
			while(sq>0)
			{
				digitCount++;
				sq /=10;
			}
			System.out.println(digitCount);
			for(int j=1;j<=digitCount;j++) 
			{
				int modVal = (int)Math.pow(10, j);
				if(modVal == p)
					continue;
				sum = sq/modVal +sq%modVal;
				System.out.println(sum);
				if(sum == p)
					System.out.println(p);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KaprekarNumbers().kaprekarNum();
	}
}

