package com.mockinterview;

public class FourteGame {
	
	private void findResultantVal() {
		// TODO Auto-generated method stub
		int arr[] = new int[] {9,8,5,2};
		char operator[] = new char[] {'+','-','/','*'};
		int result = 95;
		int temp = result;int oneDigit = 0, tenDigit = 0;
		
		oneDigit = temp%10;
		int quo = temp/10;
		tenDigit = quo*10;  
		int makedArr[] = new int[3];
		
		if(result > 10 && result <100)
		{
			makedArr = makeTwoDigitNum(arr,tenDigit,oneDigit);
		}
		System.out.println("Given Input Numbers are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		int tenthVal = makedArr[0];
		int sum = 0;int sub = 0;
		
		for(int i=1;i<makedArr.length-1;i++)
		{

			sum = makedArr[i]+makedArr[i+1];
			if(tenthVal+sum == result || tenthVal-sum == result)
				System.out.println("Combinations are: "+tenthVal+"  "+makedArr[i]+"  "+makedArr[i+1]);
			sub = makedArr[i]-makedArr[i+1];
			if(tenthVal+sub == result || tenthVal-sub == result)
				System.out.println("Combinations are: "+tenthVal+"  "+makedArr[i]+"  "+makedArr[i+1]);
			
		}
		
	}

	private int[] makeTwoDigitNum(int[] arr, int tenDigit, int oneDigit) {
		// TODO Auto-generated method stub
		int num = tenDigit/10;
		int tenthNum = 0;
		int makeArr[] = new int[3]; int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=oneDigit && arr[i]!=num)
			{
				if(arr[i] > oneDigit)
				{
					//System.out.println(arr[i]);
					tenthNum = tenDigit+arr[i];
					makeArr[0] = 	tenthNum;
				}
				else {
					makeArr[index++] = arr[i];
				}
			}
			else
			{
				makeArr[index++] = arr[i];
			}
			
		}
		return makeArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FourteGame().findResultantVal();
	}
}
