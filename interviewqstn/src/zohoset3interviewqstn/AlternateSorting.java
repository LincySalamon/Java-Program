package zohoset3interviewqstn;

public class AlternateSorting {
	public static void main(String[] args) {
		new AlternateSorting().makeAlterSort();
	}

	private void makeAlterSort() {
		// TODO Auto-generated method stub
		int[] arr = {13,2,4,15,12,10,5};
		int len = arr.length;
		for(int i=0;i<len-2;i++)
		{
			if(i%2 == 0)
			{
				int temp=0;
				if(arr[i] > arr[i+2])
				{
					temp = arr[i];
					arr[i] = arr[i+2];
					arr[i+2] = temp;
 				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
