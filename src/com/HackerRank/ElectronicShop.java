package com.HackerRank;

public class ElectronicShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 60;
		int[] keyBoard = new int[] {40,50,60};
		int[] drives = new int[] {5,8,12};
		int n = keyBoard.length;int m = drives.length;
		int max = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int sumOfKeyboardDirves = keyBoard[i]+drives[j];
				if(sumOfKeyboardDirves <=b )
				{
					if(max<sumOfKeyboardDirves)
					{
						max = keyBoard[i]+drives[j];
					}
				}
			}
		}
		System.out.println(max==0?-1:max);
		//return maxReturn;
	}

}
