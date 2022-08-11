package com.stackQueue;

import java.util.Stack;

public class PostFixToEvaluation{  
	private static int postFixToEvaluation(String postFix1) {
	// TODO Auto-generated method stub
	Stack<Integer> stack=new Stack<Integer>();
	int x=0,y=0;
	char ch[]=postFix1.toCharArray();  
	for(char c:ch) 
	{
		if(c>='0' && c<='9')
		{
			stack.push((int)c-'0'); 
		} 
		else 
		{
			y=stack.pop(); 
			x=stack.pop();
			switch(c)
			{
			case '+':
				stack.push(x+y);
				break;
			case '-':
				int r=(x>y)?(x-y):(y-x);
				stack.push(r);
				break;
			case '*':
				stack.push(x*y);
				break;
			case '/': 
				stack.push(x/y);
				break;
			case '^':
				stack.push(x^y);
				break;
			default:
				System.out.println("Invalid operator found ");
				
			}
		}
		
	}
		return stack.pop(); 
	}

	public static void main(String args[])
	{
		int val = PostFixToEvaluation.postFixToEvaluation("95+");   
		System.out.println(val);
	}
}
