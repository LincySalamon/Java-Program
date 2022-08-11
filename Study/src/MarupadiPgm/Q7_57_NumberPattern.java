package MarupadiPgm;
import java.util.Scanner;
public class Q7_57_NumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the odd length word");
		String str = sc.nextLine();
		sc.close();
		int len = str.length();
		//System.out.print(len);
		if(len%2!=0)
		{
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					if((i==j) || (i+j == len-1))
					{
						System.out.print(str.charAt(j));
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Enter odd number only");
		}
	}
}
