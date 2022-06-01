package MarupadiPgm;

public class Q41_CopyArray {
	public static void main(String[] args) {
		int[] arr = new int[] {19,34,75,98,80,23,65,1};
		int len1 = arr.length;
		int[] arr2 = new int[len1];
		
		for(int i=0;i<len1;i++)
		{
			arr2[i] = arr[i];
		}
		System.out.println("After copying array: ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
