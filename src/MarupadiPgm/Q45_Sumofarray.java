package MarupadiPgm;

public class Q45_Sumofarray {
	public static void main(String[] args) {
		int[] arr = new int[] {19,34,75,98,80,23,65,1};
		int sum=0,len=arr.length;
		for(int i=0;i<len;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of all the elements of an Array is: "+ sum);
	}
}
