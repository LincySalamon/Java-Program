package MarupadiPgm;
import java.util.Scanner;
public class Q47_PatternPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows value: ");
		int n = sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(j=i-1;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
