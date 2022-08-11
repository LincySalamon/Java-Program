package MarupadiPgm;
import java.util.Scanner;
public class Q33_AlbahbetFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charater: ");
		char ch = sc.next().charAt(0);
		sc.close();
		//int n = (int)ch;
		if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("Given character is an Albhabet");
		else
			System.out.println("Given character is not an Albhabet");
	}
}
