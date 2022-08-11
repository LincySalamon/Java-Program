package MarupadiPgm;
import java.util.Scanner;
public class Q6_SplitNumber {
	public static void spilitNum(int n,int count) {
		int val=101;
		int gp = n/4;
		int temp = val;
		for(int i=1;i<=4;i++)
		{
			System.out.println("Group "+i);
			for(int j=0;j<gp;j++)
			{
				System.out.println(temp);
				temp = temp+4;
			}
			//temp=0;
			temp = val+i;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int num = sc.nextInt();
		sc.close();
		int count=1;
		spilitNum(num,count);
	}
}
