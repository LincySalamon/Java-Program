package MarupadiPgm;

public class Q38_LargestNuminArr {
	public static void main(String[] args) {
		int[] arr = new int[] {19,34,75,98,80,23,65,1};
		int max = arr[0];
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest number in the given array is: "+max);
	}
}
