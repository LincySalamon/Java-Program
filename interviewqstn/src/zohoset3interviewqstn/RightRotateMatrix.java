package zohoset3interviewqstn;

import java.util.Scanner;

public class RightRotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RightRotateMatrix().formRightRotateMatrix();
	}

	private void formRightRotateMatrix() {
		// TODO Auto-generated method stub
		int n = 3;
		int matrix[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9} };
		System.out.println("Original Matrix is: ");
		
		matrixPrint(matrix);
		//transpose of matrix
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i]= temp;
			}
		}
		System.out.println("Transpose of matrix");
		matrixPrint(matrix);
		//right rotate of matrix
		for(int i=0;i<n;i++)
		{
			int low = 0,high = n-1;	
			while(low < high)
			{
				int temp = matrix[i][low];
				matrix[i][low] = matrix[i][high];
				matrix[i][high] = temp;	
				
				low++;
				high--;
			}
		}
		System.out.println("Right Rotated Matrix is: ");
		matrixPrint(matrix);
		
	}

	private void matrixPrint(int[][] matrix) {
		// TODO Auto-generated method stub
		int n = matrix.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
