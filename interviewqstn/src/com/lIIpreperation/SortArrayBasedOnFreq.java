package com.lIIpreperation;

public class SortArrayBasedOnFreq {

	public static void main(String[] args) {
		int[] arr = new int[] {2,2,3,4,5,12,3,3,3,12}; 
		int len = arr.length;
		int[] val = new int[len];
		int[] freq = new int[len];
		int visit = -1;
		
		
		for(int i=0;i<len;i++)
		{
			int count = 1;
			for(int j=i+1;j<len;j++)
			{
				if(arr[i] == arr[j]) {
					count++;
					freq[j] = visit;
				}
			}
			if(freq[i]!=visit)
				freq[i]= count;
		}
		//arrayPrint(freq);
		//System.out.println();
		arrayPrintFreq(freq,arr,visit);
		decendingOrder(freq,arr,visit);
	}

	private static void decendingOrder(int[] freq, int[] arr, int visit) {
		int len = freq.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(freq[i]<freq[j])
				{
					int tempForFreq = freq[i];
					int tempForArr = arr[i];
					freq[i] = freq[j];
					arr[i] = arr[j];
					freq[j] = tempForFreq;
					arr[j] = tempForArr;
				}
			}
		}
		//arrayPrint(freq);
		//System.out.println();
		//arrayPrint(arr);
		//System.out.println();
		for(int i=0;i<freq.length;i++)
		{
			for(int j=0;j<freq[i];j++)
			{
				System.out.print(arr[i]+"  ");
			}
		}
	}

	private static void arrayPrintFreq(int[] freq, int[] arr,int visit) {
		int len = freq.length;
		for(int i=0;i<len;i++)
		{
			if(freq[i] != -1)
				System.out.println(arr[i]+"   "+freq[i]);
		}
	}
//
//	private static void arrayPrint(int[] freq) {
//		int len = freq.length;
//		for(int i=0;i<len;i++)
//		{
//			if(freq[i]!=-1)
//				System.out.print(freq[i]+"  ");
//		}
//	}

}
