package com.mockinterview;

public class FindPairDivideBYVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindPairDivideBYVal().findDividePair();
	}

	private void findDividePair() {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6};
		int k = 5;
		int len = arr.length;
		int sum = 0;
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<len;j++)
			{
				if(i<j)
				{
					sum = arr[i] + arr[j];
					if(sum % k == 0)
						System.out.print("["+arr[i]+"  "+arr[j]+"]");
				}
			}
		}
	}

}
