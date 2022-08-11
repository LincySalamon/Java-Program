package com.lIIpreperation;

public class SnakePattern {

	public static void main(String[] args) {
		new SnakePattern().patternPrint();
	}

	private void patternPrint() {
		int n =4;
		int num = 0;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<(n*2)-i;j++)
			{
				if(j<n-i)
					System.out.print("   ");
				else if(i%2==1)
				{
					num++;
					System.out.print(num+"  ");
				}
				else {
					System.out.print(num+"  ");
					num--;
				}
			}num +=n;
			System.out.println();
		}
	}

}
