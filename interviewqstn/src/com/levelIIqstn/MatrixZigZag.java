package com.levelIIqstn;

public class MatrixZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MatrixZigZag().printZigZag();
	}

	private void printZigZag() {
		// TODO Auto-generated method stub
		int n =3,m=3;
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[] val = new int[n*m];
		int[] sumOfIndex = new int[n*m];
		int index = 0,valIndex=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sumOfIndex[index++] = i+j;
				val[valIndex++] = arr[i][j];  
			}
		}
		for(int i=0;i<val.length;i++)
		{
			System.out.print(val[i]);
		}
		System.out.println();
		int mid = (int) Math.ceil(arr.length/2);
		for(int i=0;i<sumOfIndex.length-1;i++)
		{
			
			if(sumOfIndex[i] > sumOfIndex[i+1])
			{
				int temp = sumOfIndex[i];
				int temp1 = val[i];
				sumOfIndex[i] = sumOfIndex[i+1];
				val[i] = val[i+1];
				sumOfIndex[i+1] = temp; 
				val[i+1] = temp1;
				
			}
		}
		
		for(int i=0;i<val.length;i++)
		{
			//System.out.println(sumOfIndex[i]+"sum");
			
			System.out.print(val[i]);
		}
	}

}
