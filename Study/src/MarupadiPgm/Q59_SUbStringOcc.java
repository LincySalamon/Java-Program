package MarupadiPgm;
import java.util.Scanner;
public class Q59_SUbStringOcc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the sub string to find: ");
		String str2 = sc.nextLine();
		
		int val = str1.indexOf(str2);
		if(val == -1)
		{
			System.out.println(str2+" is not present in the str1");
		}
		else
		{
			System.out.println(str2+" is present in the str1 at "+val+" index");
		}
	}
}
