package com.levelIIqstn;

import java.util.Scanner;
import java.util.Stack;

public class CheckPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckPara().checkParanthesis();
	}

	private void checkParanthesis() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression: ");
		String expression = sc.nextLine();
		Stack<Character> chstack = new Stack<Character>();
		int len = expression.length();
		char ch;
				
		for(int i=0;i<len;i++)
		{
			ch = expression.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{')
			{
				chstack.push(ch);
			}
			else if(ch == ')')
			{
				if(chstack.isEmpty() || chstack.pop() != '(')
				{
					System.out.println("Unbalanced");
				}
			}
			else if(ch == ']')
			{
				if(chstack.isEmpty() || chstack.pop() != '[')
				{
					System.out.println("Unbalanced");
				}
			}
			else if(ch == '}')
			{
				if(chstack.isEmpty() || chstack.pop() != '{')
				{
					System.out.println("Unbalanced");
				}
			}
		}
		if(chstack.isEmpty())
			System.out.println("Balanced");
	} 
}
