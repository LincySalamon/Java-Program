package interview;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		new Palindrome().checkpalindrome();
	}

	private void checkpalindrome() {
		Scanner sc = new Scanner(System.in);
		String str = "Madam";
		char ch[] = str.toCharArray();
		int len = ch.length;
		char[] original = Arrays.copyOf(ch, len);
		
		for(int i=0;i<len/2;i++) 
		{
			char temp = ch[i];
			ch[i] = ch[len-i-1];
			ch[len-i-1] = temp;
		}
		
		if(Arrays.equals(ch, original))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not a Palindrome");
		sc.close();
	}

}
