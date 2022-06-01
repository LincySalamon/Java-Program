
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi";
		String str1 = "world";
		int len = str.length();
		int len1 = str1.length();
		int count =0;
		for(int i=0;i<len;i++)
		{
			char ch = str.charAt(i);
			
			for(int j=0;j<len1;j++)
			{
				//System.out.println(str1.charAt(j));
				if(ch == str1.charAt(j))
					count++;
			}
		}
		System.out.println(count);
	}

}
