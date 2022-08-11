package com.lIIpreperation;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		new OccuranceOfNumber().findOccurance();
	}

	private void findOccurance() {
		int arr[] = new int[] {1, 2, 4, 5, 2, 1, 5, 2, 10, 22, 5};
		int len = arr.length;
		int result[] = new int[len];
		int[] freq = new int[len];
		int visit = -1;
		
		for(int i=0;i<len;i++)
		{
			int count = 1;
			for(int j=i+1;j<len;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;  
					freq[j] = visit;
				}
			}
			if(freq[i]!=visit)
				freq[i]= count;
		}
		printElementOccurance(freq,arr,visit);
	}
    
	private void printElementOccurance(int[] freq, int[] arr, int visit) {
		int len = freq.length;
		for(int i=0;i<len;i++)
		{
			if(freq[i] !=-1 && freq[i] != 1)
			{
				System.out.print(arr[i]+"---->"+freq[i]);
				System.out.println();
			}
		}
		
	}

}
