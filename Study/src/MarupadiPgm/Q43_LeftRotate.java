package MarupadiPgm;

public class Q43_LeftRotate {
	public static void main(String[] args) {  
		int [] arr = new int [] {1, 2, 3, 4, 5};  
		int n =2;
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			int j,firstEle;
			firstEle = arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j] = arr[j+1];
			}
			arr[j] = firstEle;
		}
		System.out.println();
		System.out.println("After left Rotate Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
