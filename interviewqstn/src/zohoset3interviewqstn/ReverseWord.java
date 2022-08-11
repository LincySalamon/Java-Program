package zohoset3interviewqstn;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		ReverseWord rw = new ReverseWord();
		System.out.print(rw.reverse(str));   
	}

	private String reverse(String str) {
		int i = str.length()-1;
		int start,end = i+1;
		String result = "";
		
		while(i>=0)
		{
			if(str.charAt(i) == ' ')
			{
				start = i+1;
				while(start != end)
				{
					result += str.charAt(start++);
				}
				result += ' ';
				end = i;
			}
			i--;
		} 
		start = 0;
		while(start != end)
		{
			result += str.charAt(start++);
		}
		return result; 
	}

}
