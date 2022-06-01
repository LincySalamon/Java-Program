package MarupadiPgm;

public class Q10_AlternateSort {
	public static void main(String[] args) {
		int[] arr = {13,2,4,15,12,10,5};
		int l = arr.length;
		for(int i=0;i<l;i++)//sort an array
		{
			for(int j=i+1;j<l;j++)
			{
				int temp=0;
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 				}
			}
			//System.out.print(arr[i]+" ");
		}
		int i=0,j=l-1;
		while(i < j)
		{
			System.out.print(arr[j--]+" ");
			System.out.print(arr[i++]+" ");
		}
		if(l % 2 != 0)
		{
			System.out.print(arr[i]);
		}
	}
}
