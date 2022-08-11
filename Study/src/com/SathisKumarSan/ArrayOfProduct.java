package com.SathisKumarSan;

//Array of product of All the elements except itself.Example : Input arr = {1,2,3,4}
//Output arr = {24,12,8,6}

public class ArrayOfProduct {

	private void findProduct() {
		int[] arr = new int[] {1,2,3,4};
		int len = arr.length;
		int result[] = new int[len];
		
		
		for(int i=0;i<len;i++)
		{
			int multipleVal = 1;
			for(int j=0;j<len;j++)
			{
				if(i==j)
				{
					continue;
				}
				multipleVal *= arr[j];
			}
			result[i] = multipleVal;
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(result[i]+"  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayOfProduct().findProduct();
	}
}
