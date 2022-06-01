package MarupadiPgm;
import java.util.Scanner;
public class Q24_AsciiVal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the chartecter to get the Ascii value");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.println("Ascii value of "+ch+" is "+ (int)ch);
	}
}
