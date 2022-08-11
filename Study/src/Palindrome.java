import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		char[] ch = str.toCharArray();
		int len = ch.length;
		char[] original = Arrays.copyOf(ch, len);
		
		for(int i=0;i<len/2;i++)
		{
			char temp = ch[i];
			ch[i] = ch[len-i-1];
			ch[len-i-1] = temp;
		}
		
		//System.out.print(Arrays.toString(ch));
		//System.out.println();
		//System.out.print(original);
		
		if(Arrays.equals(ch, original))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
