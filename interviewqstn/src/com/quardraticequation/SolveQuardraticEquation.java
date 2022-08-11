package com.quardraticequation;

public class SolveQuardraticEquation {

	public static void main(String[] args) {
		new SolveQuardraticEquation().findSolution();
	}

	private void findSolution() {
		StringBuilder str = new StringBuilder("(2X+Y)*(3X-5Y)");
		System.out.println(str);
		String[] splitVal = str.toString().split("*");
		
		for(int i=0;i<splitVal.length;i++)
		{
			System.out.println(splitVal[i]);
		}
	}

}
