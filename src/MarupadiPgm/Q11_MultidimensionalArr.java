package MarupadiPgm;

public class Q11_MultidimensionalArr {
	public static void main(String[] args) {
		int mat[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int n = mat.length;
		System.out.println("Original Array: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" "+"\t");
			}
			System.out.println();
		}
		//1st find transpose of matrix
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(i != j)
				{
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					mat[j][i] = temp;
				}
			}
		}
		//print a transpose of matrix
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+"   ");
			}
		}*/
		//swap the element swap first column with last column 2nd with 3rd(for 4*4)
		for(int i=0;i<n;i++)
		{
			int low = 0,high = n-1;
			while(low < high)
			{
				int temp = mat[i][low];
				mat[i][low] = mat[i][high];
				mat[i][high] = temp;
				low++;
				high--;
			}
		}
		System.out.println("Array after rotate: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" "+"\t");
			}
			System.out.println();
		}
	}
}
