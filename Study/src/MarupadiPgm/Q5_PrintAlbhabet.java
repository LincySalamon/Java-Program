package MarupadiPgm;
import java.util.Scanner;
public class Q5_PrintAlbhabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		sc.close();
		int val = (int)ch - 65+1;
		//System.out.println(val);
		int temp = val;
		for(int j=0;j<=temp;j++)
		{
			for(int i =0;i<val;i++)
			{
				System.out.print(ch);
			}
			ch--;
		System.out.println(" ");
		val--;
		}
	}
}
