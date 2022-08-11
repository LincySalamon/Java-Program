package MarupadiPgm;
import java.util.Scanner;
public class Q51_ReverseStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		sc.close();
		System.out.println("After a String reverse:");
		int len = str.length();
		for(int i=len;i>0;--i)
		{
			System.out.print(str.charAt(i-1));
		}
	}
}
