package MarupadiPgm;
import java.util.Scanner;
public class Q25_QuoandRem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dividend number ");
		int num = sc.nextInt();
		System.out.println("Enter the divisor number ");
		int div = sc.nextInt();
		sc.close();
		int rem = num % div;
		int quo = num / div;
		System.out.println("Quotient = "+quo);
		System.out.println("Remainder = "+rem);
	}
}
