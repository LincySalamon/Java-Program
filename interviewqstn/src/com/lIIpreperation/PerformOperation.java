package com.lIIpreperation;

import java.util.ArrayList;

//Input: "12345 * + - + "
//Result: 6 [Explanation: 1 * 2 + 3 - 4 + 5 = 6]
public class PerformOperation {

	public static void main(String[] args) {
		new PerformOperation().numbersWithOperators();
	}

	private void numbersWithOperators() {
		String str = "374291--*+-";//"12345*+-+";/
		int len = str.length();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Character> operators = new ArrayList<Character>();
		int index = 0;
		
		for(int i=0;i<len;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				numbers.add((int)(str.charAt(i)-48));
			}
			else
			{
				operators.add(str.charAt(i));
			}
		}
		//arrayPrint(numbers);
		System.out.println(numbers);
		System.out.println(operators);
		
		//System.out.println(numbers.size()+"   "+operators.size());
		if((numbers.size()-1) == operators.size())
		{
			performOperations(numbers,operators);
		}
		else {
			System.out.println("Wrong Input");
		}
	}

	private void performOperations(ArrayList<Integer> numbers, ArrayList<Character> operators) {
		int res = 0;
		int val = 0;
		int numberLen = numbers.size();
		int divideCheck = 0;
		res = numbers.get(0);
		for(int i=1;i<numberLen;i++)
		{
			
			val = numbers.get(i);
			switch (operators.get(i-1)) {
			case '+': {
				res = res+val;
				System.out.println("in +"+"   "+res);
				break;
			}
			case '-': {
				res = res-val;
				System.out.println("in -"+"   "+res);
				break;
			} 
			case '*': {
				res = res*val;
				System.out.println("in ****"+"   "+res);
				break;
			}
			case '/': {
				if(val == 0)
				{
					System.out.println("Abnormal State");
					divideCheck = 1;
				}
				System.out.println("in /"+"   "+res);
				res = res/val;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + operators.get(i));
			}
			if(divideCheck==1)
				break;
		}
		
		if(divideCheck!=1)
			System.out.println(res);
	}
}
