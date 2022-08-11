package MarupadiPgm;
import java.util.Scanner;
public class Q34_SumofNaturalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting natural number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the ending natural number: ");
		int n2 = sc.nextInt();
		sc.close();
		int sum=0;
		int i = n1;
		while(i <= n2)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of natural numbers from "+n1+" to "+n2+" is "+sum);
	}
}
