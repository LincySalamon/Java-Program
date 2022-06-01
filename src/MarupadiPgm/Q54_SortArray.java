package MarupadiPgm;

import java.util.Arrays;

public class Q54_SortArray {
	public static void main(String[] args) {
		int arr[] = {13,2,4,15,12,10,5};
		int len = arr.length,arrEven=0,arrOdd=0;
		arrEven = len/2;
		if(len%2==0)
			arrOdd = len/2;
		else
			arrOdd = len/2 + 1;
		int oddArr[] = new int[arrOdd];
		int evenArr[] = new int[arrEven];
		int odditr=0,evenitr=0;
		int x=0,y=1;
		while(x<len)
		{
			oddArr[odditr++] = arr[x];
			x = x+2;
		}
		while(y<len)
		{
			evenArr[evenitr++] = arr[y];
			y = y+2;
		}
		for(int j=0;j<arrOdd;j++)
		{
			for(int k=j+1;k<arrOdd;k++)
			{
				if(oddArr[j] < oddArr[k])
				{
					int temp = oddArr[j];
					oddArr[j] = oddArr[k];
					oddArr[k] = temp;
				}
			}
		}
		System.out.println("Even Elements are:");
		for(int i=0;i<arrOdd;i++)
		{
			System.out.print(oddArr[i]+" ");
		}
		for(int j=0;j<arrEven;j++)
		{
			for(int k=j+1;k<arrEven;k++)
			{
				if(evenArr[j] > evenArr[k])
				{
					int temp = evenArr[j];
					evenArr[j] = evenArr[k];
					evenArr[k] = temp;
				}
			}
		}
		System.out.println();
		//Arrays.sort(evenArr);
		System.out.println("Odd Elements are:");
		for(int i=0;i<arrEven;i++)
		{
			System.out.print(evenArr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<len;i++)
		{
			System.out.print(oddArr[i]+" ");
			System.out.print(evenArr[i]+" ");
		}
	}
}
