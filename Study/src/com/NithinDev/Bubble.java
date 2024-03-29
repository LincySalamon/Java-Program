package com.NithinDev;
//Java program for implementation of Bubble Sort
class Bubble {
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		int count =0;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
		System.out.println(count);
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		Bubble ob = new Bubble();
		int arr[] = { 8,22,7,9,31,5,13 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}


