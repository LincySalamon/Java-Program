package com.NithinDev;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2,9,8,1,6,10,3};
		int len = arr.length;
		insertionSort(arr,len);
	}

	private static void insertionSort(int[] arr, int len) {
		// TODO Auto-generated method stub
		//for loop for n(length of arr) iteration
		for(int i=0;i<len;i++)
		{
			int temp = arr[i];
			int j = i;//j pointing next ele
			//checking left side
			while(j > 0 && temp < arr[j-1])
			{
				arr[j] = arr[j-1];
				j--;//moving position by left by 1
			}
			arr[j] = temp;//correct index of the value
			for(int k =0;k<len;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
	}

}
