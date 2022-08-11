package com.levelIIqstn;

//Given a Boolean matrix mat[M][N] of size M X N, modify it such that 
//if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.

public class BooleanMatrix {
	
	public void makeBooleanMat() {
		// TODO Auto-generated method stub
		int m=3,n=3;
		int[][] arr = new int[][] {{0,1,1},{1,1,0},{1,1,1}};
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j] == 0)
				{
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BooleanMatrix().makeBooleanMat();
	}
}
