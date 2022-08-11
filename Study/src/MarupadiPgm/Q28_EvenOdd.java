package MarupadiPgm;
import java.util.Scanner;
public class Q28_EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		if(num == 0)
			System.out.println("Enter natural number");
		else if(num % 2 != 0)
			System.out.println(num+" is an Odd number");
		else
			System.out.println(num+" is an Even number");
	}
}
