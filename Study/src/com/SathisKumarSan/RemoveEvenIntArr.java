package com.SathisKumarSan;

public class RemoveEvenIntArr {
	
	private void evenInt() {
		int[] arr = new int[] {1,2,4,5,6,10,3};
		int len = arr.length;
		int count = 0;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i] % 2 == 0)
			{
				count++;
			}
		}
		
		int[] result = new int[count];
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] %2 != 0)
			{
				
				System.out.println(result[index++] = arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RemoveEvenIntArr().evenInt();
	}
}
