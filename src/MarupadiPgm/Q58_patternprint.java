package MarupadiPgm;
import java.util.Scanner;
public class Q58_patternprint {
	public static void main(String[] args) {
		int n, i, j, space = 1;
		System.out.print("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		space = n - 1;
		for (j = 1; j<= n; j++)
		{
			for (i = 0; i<= space; i++)
			{
				System.out.print("*");
			}
			for (i = 1; i < 2 * j - 1; i++)
			{
				System.out.print("-");
			}
			for (i = 0; i<= space; i++)
			{
				System.out.print("*");
			}
			space--;
			System.out.println("");
		}
		space = 1;
		for (j = 1; j<= n - 1; j++)
		{
			for (i = 0; i<= space; i++)
			{
				System.out.print("*");
			}
			for (i = 1; i< 2 * (n - j) - 1; i++)
			{
				System.out.print("-");
			}
			for (i = 0; i<= space; i++)
			{
				System.out.print("*");
			}
			space++;
			System.out.println("");
		}
	}
}
