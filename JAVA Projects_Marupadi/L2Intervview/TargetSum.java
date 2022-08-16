

public class TargetSum {

	public static void main(String[] args) {
		new TargetSum().findTargetValue();
	}

	private void findTargetValue() {
		int arr[] = new int[] {-1, 0, 1, 2, -1, -4};//{-2, -4, -1, 0, 1, 3, 4, -3};
		int len = arr.length;
		int target = 0;
		int[] result1 = new int[3];
		int[] result2 = new int[3];
		
		for(int i=0;i<len-2;i++)
		{
			for(int j=i+1;j<len-1;j++)
			{
				for(int k=j+1;k<len;k++)
				{
					if(arr[i]+arr[j]+arr[k] == target)
					{
						System.out.println( "["+arr[i]+","+arr[j]+","+arr[k]+"]" );
					}
				}
			}
		}
	}

}
