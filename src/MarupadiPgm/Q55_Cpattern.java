package MarupadiPgm;
import java.util.Scanner;
public class Q55_Cpattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++)
		{
			if(i == 1 || i==num)
				for(int j=1;j<=num;j++)
				{
					System.out.print("*");
				}
			else
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
