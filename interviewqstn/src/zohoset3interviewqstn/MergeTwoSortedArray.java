package zohoset3interviewqstn;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MergeTwoSortedArray().mergeArray();
	}

	private void mergeArray() {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] {2,4,5,6,7,9,10,13};
		int[] arr2 = new int[] {2,3,4,5,6,7,8,9,11,15};
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] res = new int[len1+len2];
		int i=0,j=0,k=0;
		while(i<len1 && j<len2)
		{
			if(arr1[i] < arr2[j] && arr1[i]!=arr2[j])
			{
				res[k++] = arr1[i++];
			} 
			else{
				//if(arr1[i]!=arr2[j])
					res[k++] = arr2[j++];
			}
		}
		while(i<len1) 
		{
			res[k++] = arr1[i++];
		}
		while(j<len2)
		{
			res[k++] = arr2[j++];
		}
		
		for(int x=0;x<res.length;x++)
		{
			System.out.print(res[x]+"  ");
		}
		
		int len = res.length;
		System.out.println();
		System.out.print("Merged Array: ");
		for(int l=0;l<len;l++)
		{ 
			for(int m=l+1;m<len;m++) 
			{
				if(res[l] == res[m])
				{
					for(int n=m;n<len-1;n++)
					{
						res[n]=res[n+1];
					} 
					len--;
					m--;
				}
			}
		}
		for(int l=0;l<len;l++)
		{
			System.out.print(res[l]+"  ");
		}
	}

}
