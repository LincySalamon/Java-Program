package MarupadiPgm;
import java.util.Scanner;
public class Q32_PositiveNegativev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		int num = sc.nextInt();
		sc.close();
		if(num > 0)
			System.out.println(num+" is positive integer");
		else
			System.out.println(num+" is negative integer");
	}
}
