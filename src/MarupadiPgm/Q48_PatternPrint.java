package MarupadiPgm;
import java.util.Scanner;
public class Q48_PatternPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows value: ");
		int n = sc.nextInt();
		sc.close();
		int i,j,k,count = 1;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=n;k++)
			{
				System.out.print(k+" ");
			}
			for(j=n-1;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			count++;
		}
	}
}
