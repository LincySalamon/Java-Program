package com.levelIIqstn;

/*Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.
Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0
Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0*/
public class NextIntegerReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NextIntegerReplace().replaceNextInt();
	}

	private void replaceNextInt() {
		// TODO Auto-generated method stub
		int arr[] = new int[] {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		int len = arr.length;
		int result[] = new int[len];
		int result1[] = new int[len];
		for(int i=0;i<len-1;i++)
		{
			if(arr[i] == arr[i+1]) 
			{
				arr[i] = arr[i]*2;
				arr[i+1] = 0;
			}
			else {
				continue;      
			}
		}
		for(int i=0;i<len;i++)
		{
			if(arr[i]==0)
				continue;
			for(int j=i;j>0;j--)
			{
				if(arr[j-1]==0)
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}

		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
