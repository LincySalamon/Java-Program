package MarupadiPgm;
import java.util.Scanner;
public class Q50_PatternPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows value: ");
		int n = sc.nextInt();
		sc.close();
		int temp=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(temp+" ");
			}
			temp--;
			System.out.println();
		}
	}
}
