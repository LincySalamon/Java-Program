package MarupadiPgm;
import java.util.Scanner;
public class Q2_Printletter {
	public static void main(String[] args) {
		//char ch = 'A';
		//System.out.printf("%d",(int)ch);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		sc.close();
		while((int)ch <= 90)
		{
			System.out.println(ch++);
		}
}
}