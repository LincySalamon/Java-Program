package MarupadiPgm;

public class Q46_RotateRight {
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
			int j,lastEle;
			lastEle = arr[arr.length-1];
			for(j = arr.length-1; j > 0; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0] = lastEle;
		}
		System.out.println();
		System.out.println("After Right Rotate Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
