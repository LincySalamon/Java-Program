package com.NandhaSan;

public class ArrayDelete {
	

	private void deletProcess() {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int len = arr.length;
		int deleteVal = 9;
		for(int i=0;i<len;i++)
		{
			if(deleteVal == arr[i])
			{
				for(int j=i;j<len-1;j++)
				{
					arr[j] = arr[j+1];
				}
				break;
			}
		}
		System.out.println("Array after Deletion");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		//System.out.println(arr.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayDelete().deletProcess();
	}

}
