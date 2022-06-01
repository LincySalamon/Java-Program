package com.NithinDev;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {50,43,40,30,5,23,20,10};
		int len = arr.length;
		int i=0,j=1;
		
		/*while(j<len) {
		i=0;
			while(i<len-j)
			{
				if(arr[i] > arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				i++;
			}
			j++;
		}*/
		//50,40,30
		for(i=0;i<len;i++)
		{
			
			if(arr[i] > arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println("Bubble Sorted Array is :");
		for(int k=0;k<len;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

}
