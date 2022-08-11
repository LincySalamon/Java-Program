import java.util.Scanner;
public class NuminStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with number:");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for(char c : ch)
		{
			if(Character.isLetter(c))
			{
				sb1.append(c);
			}
			if(Character.isDigit(c))
			{
				sb.append(c);
			}
		}
		System.out.println(sb1+"               "+sb);
	}
}
