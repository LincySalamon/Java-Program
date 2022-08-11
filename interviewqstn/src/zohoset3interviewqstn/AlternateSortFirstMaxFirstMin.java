package zohoset3interviewqstn;


public class AlternateSortFirstMaxFirstMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AlternateSortFirstMaxFirstMin().alternateSorting();
	}

	private void alternateSorting() {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		int len = arr.length;
		int index=0;
		int[] result = new int[len];
		int i=0,j=len-1;
		while(i<j)
		{ 
			result[index++] = arr[j--];
			result[index++] = arr[i++];
		}
		if(len % 2 !=0 )
			result[index++] = arr[i];
		  
		for(int k=0;k<len;k++)
		{
			System.out.print(result[k]+"  ");
		}
	}

}
