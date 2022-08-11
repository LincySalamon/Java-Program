package MarupadiPgm;
import java.util.Scanner;
public class Q60_SeriesSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int sum=0,total=0;
		
		for(int i=0;i<n;i++)
		{
			sum = (sum*10)+1;
			System.out.print(sum);
			if(i< n-1)
				System.out.print("+");
			total = total+sum;
		}
		System.out.println();
		System.out.print("----"+total+"----");
	}
}
