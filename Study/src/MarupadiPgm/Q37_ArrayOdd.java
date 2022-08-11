package MarupadiPgm;

public class Q37_ArrayOdd {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		int len = arr.length;
		for(int i=0;i<len;i=i+2)
		{
			if(i%2==0)
				System.out.println(arr[i]);
		}
	}
}
