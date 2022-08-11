package MarupadiPgm;

import java.util.Arrays;

public class Q36_ArrayEven {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6,7};
		int len = arr.length,temp=0;
		int arrlen = 0;
		
		if(len%2 == 0)
			arrlen = len/2;
		if(len%2 != 0)
			arrlen = len/2 +1;
		
		int[] arr1 = new int[arrlen];
		//System.out.println(len);
		for(int i=0;i<len;i=i+2)
		{
			//if(i%2==0)
				arr1[temp++] = arr[i];
				System.out.print(arr[i]);
		} 
		Arrays.sort(arr1);
		System.out.println();
		for(int i=0;i<arrlen;i++)
		{
				System.out.print(arr1[i]);
		}
	}
}
