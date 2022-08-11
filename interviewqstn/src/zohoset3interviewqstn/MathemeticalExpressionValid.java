package zohoset3interviewqstn;

import java.util.Scanner;

public class MathemeticalExpressionValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MathemeticalExpressionValid().checkValid();
	}

	private void checkValid() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mathematical Expression");
		String exp = sc.nextLine();
		int len = exp.length();
		int i=0,j=0,t=0,l=0;
		
		for(i=0;i<len;i++)
		{
			if(exp.charAt(i) == '(')
			{
				t++;
			}
			else if(exp.charAt(i) == ')')
			{
				t--;
			}
			else if(exp.charAt(i) == '*' ||exp.charAt(i) == '*' ||exp.charAt(i) == '+' || exp.charAt(i) == '-')
			{
				if(exp.charAt(i-1)>96 && exp.charAt(i-1)<123 && exp.charAt(i+1)>96 && exp.charAt(i+1)<123)
				{
					continue;
				}else {
					break;
				}
			}
		}
		if(i==len && t==0)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		}
}
