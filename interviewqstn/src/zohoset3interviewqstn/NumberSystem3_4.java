package zohoset3interviewqstn;

public class NumberSystem3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberSystem3_4().findNumbers();
	}

	private void findNumbers() {
		// TODO Auto-generated method stub
		for(int k=0;k<16;k++)
		{
			int n = k;
			String arr[] = new String[n+1];
			arr[0] = "";
			int size = 1,m=1;
			
			while(size <= n)
			{
				for(int i=0;i<m && (size+i) <=n;i++)  
				{
					arr[size+i] = "3"+arr[size-m+i];
				}
				for(int i=0;i<m && (size+m+i)<=n;i++)
				{
					arr[size+i+m] = "4"+arr[size-m+i];
				}
				m=m*2;
				size = size+m;
			}
			System.out.println(arr[n]);
		}
	}

}
