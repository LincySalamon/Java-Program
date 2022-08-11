package MarupadiPgm;
import java.util.Scanner;
public class Q56_PatternPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows value: ");
		int n = sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
}
