package MarupadiPgm;
import java.util.Scanner;
public class Q3_RevandSubtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which have minimum 2 digit");
		int num = sc.nextInt();
		sc.close();
		int temp = num, rev =0;
		while(temp !=0 )
		{
			int rem = temp%10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		//System.out.println(rev);
		System.out.printf("%d - %d = %d",num,rev,num-rev);
	}
}
