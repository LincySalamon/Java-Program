package com.NithinDev;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int position = bs.doBinarySearch();
		if(position > 0) {
			System.out.println("Your key is present at position "+position);
		}
		else {
			System.out.println("Your key is not present");
		}
	}

	private int doBinarySearch() {
		// TODO Auto-generated method stub
		int arr[] = new int[] {50,43,40,30,5,23,20,10};
		int len = arr.length;
		int i=0,j=1;
		while(j<len) {
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
		}
	int min=0,max=len-1;
	int key=10;
	while(min<=max)
	{
		int mid = (min+max)/2;
		if(key == arr[mid]) {
			return mid;
		}
		else if(key<arr[mid])
		{
			max = mid-1;
		}
		else
		{
			min = mid+1;
		}
	}
	return -1;
	}
}
