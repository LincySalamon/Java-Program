

import java.util.Scanner;
import java.util.Stack;

public class Checkparanthesis {

	public static void main(String[] args) {
		new Checkparanthesis().checkpara();
	}

	private void checkpara() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string contains paranthesis (,),{,},[,],<,>");
		String str = sc.nextLine();
		sc.close();
		Stack<Character> chstack = new Stack<Character>();
		int len = str.length();
		char ch;
		if(isBalance(len,str,chstack))
			System.out.println("Balance or valid");
		else
			System.out.println("Unbalanced or invalid");
		
	}

	private boolean isBalance(int len, String str, Stack<Character> chstack) {
		char ch;
		for(int i=0;i<len;i++)
		{
			ch = str.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[' || ch == '<')
			{
				chstack.push(ch);
			}
			else if(ch == ')')
			{
				if(chstack.isEmpty() || chstack.pop() != '(')
				{
					return false;
				}
			}
			else if(ch == '}')
			{
				if(chstack.isEmpty() || chstack.pop() != '{')
				{
					return false;
				}
			}
			else if(ch == ']')
			{
				if(chstack.isEmpty() || chstack.pop() != '[')
				{
					return false;
				}
			}
			else if(ch == '>')
			{
				if(chstack.isEmpty() || chstack.pop() != '<')
				{
					return false;
				}
			}
		}
		
		if(chstack.isEmpty())
			return true;
		
		return false;
	}

}
