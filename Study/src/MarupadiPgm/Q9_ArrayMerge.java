package MarupadiPgm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q9_ArrayMerge {
	public static void main(String[] args) {
		int arr1[] = {2,4,5,6,7,9,10,13};
		int arr2[] = {2,3,4,5,6,7,8,9,11,15};
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = len1+len2;
		int arr3[] = new int[len3]; 
		
		for(int i=0;i<len1;i++)
		{
			arr3[i] = arr1[i];
		}
		for(int j=0;j<len2;j++)
		{
			arr3[len1+j] = arr2[j];
		}
		
		for(int i=0;i<len3;i++)
		{
			for(int j=i+1;j<len3;j++) 
			{
				if(arr3[i] == arr3[j])
				{
					for(int k=j;k<len3-1;k++)
					{
						arr3[k]=arr3[k+1];
					} 
					len3--;
					j--;
				}
			}
		}
		Arrays.sort(arr3);

		System.out.print("Merged Array: "); 

		for(int i=0;i<len3;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}
