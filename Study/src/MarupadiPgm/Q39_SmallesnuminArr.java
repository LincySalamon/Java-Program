package MarupadiPgm;

public class Q39_SmallesnuminArr {
	public static void main(String[] args) {
		int[] arr = new int[] {19,34,75,98,80,23,65,1};
		int min = arr[0];
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest number in an Array is: "+min);
	}
}
