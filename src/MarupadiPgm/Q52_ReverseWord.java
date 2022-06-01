package MarupadiPgm;
import java.util.Scanner;
public class Q52_ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		sc.close();
		String[] words = str.split("\\s");
		int len = words.length;
		System.out.println(len);
	
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
	}
}
