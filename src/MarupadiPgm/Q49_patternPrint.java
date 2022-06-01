package MarupadiPgm;
import java.util.Scanner;
public class Q49_patternPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows value: ");
		int n = sc.nextInt();
		sc.close();
		/*for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
