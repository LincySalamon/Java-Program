package com.NithinDev;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {13,16,11,20,9,56};
		int len = arr.length;
		selectionSort(arr,len);
	}

	private static void selectionSort(int[] arr, int len) {
		// TODO Auto-generated method stub
		for(int x=0;x<len;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println("\n");
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int smallest = arr[j];
					arr[j] = arr[i];
					arr[i] = smallest;
				}
			}
			for(int k=0;k<len;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
	}

}
