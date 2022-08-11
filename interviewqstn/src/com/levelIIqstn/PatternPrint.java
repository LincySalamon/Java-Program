package com.levelIIqstn;
/*1	12	11	10	9

	2	13	15	8

		3	14	7

			4	6

				5*/


public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PatternPrint().printPattern();
	}

	private void printPattern() {
		// TODO Auto-generated method stub
		int num=1;
		int n = 5;
		int[][] val = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					val[i][j] = num++;
			}
		}
		for(int i=n-1-1;i>=0;i--)
		{
			int j = n-1;
			val[i][j] = num++;
		}
		for(int j=n-1-1;j>0;j--)
		{
			int i = 0;
			val[i][j] = num++;
		}
		int k = 2;
		for(int i=1;i<=n-1-2;i++)
		{
			val[i][k] = num++;
			k++;
		}
		//System.out.println(k);
		for(int i=1;i<n-1-2;i++)
		{
			if((k-1)== 3 && i==1)
				val[i][k-1] = num++;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(val[i][j]!=0)
					System.out.print(val[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
}
