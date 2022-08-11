package MarupadiPgm;
import java.util.Scanner;
public class Q27_Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int n2 = sc.nextInt();
		sc.close();
		System.out.println("Before swapping x= "+n1+" y= "+n2);
		int t;
		t = n1;
		n1 = n2;
		n2 = t;
		System.out.println("After swapping x= "+n1+" y= "+n2);
	}
}
