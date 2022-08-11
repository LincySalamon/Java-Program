package MarupadiPgm;

public class Q53_AlbhabetwithNum {
	public static void main(String[] args) {
		String str = "a3b2";
		//char[] ch = str.toCharArray();
		int l = str.length();
		
		for(int i=0;i<l;i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int a = Character.getNumericValue(str.charAt(i));
				for(int j=1;j<a;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
}
