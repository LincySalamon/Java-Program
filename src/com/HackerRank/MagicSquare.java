package com.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] s = new int[][]{{5,3,4},
							   {1,5,8},
							   {6,4,2}};
		ArrayList<List<Integer>> s1 = new ArrayList<List<Integer>>();
		//s1.get(0).add(5);s1.get(0).add(3);s1.get(0).add(4);
		//s1.add(new List<Integer>());
		s1.get(0).add(0,8);
		s1.get(0).add(1,1);
		int[][] squares =  new int[][] {
				{8, 1, 6, 3, 5, 7, 4, 9, 2},
			    {6, 1, 8, 7, 5, 3, 2, 9, 4},
			    {4, 9, 2, 3, 5, 7, 8, 1, 6},
			    {2, 9, 4, 7, 5, 3, 6, 1, 8}, 
			    {8, 3, 4, 1, 5, 9, 6, 7, 2},
			    {4, 3, 8, 9, 5, 1, 2, 7, 6}, 
			    {6, 7, 2, 1, 5, 9, 8, 3, 4}, 
			    {2, 7, 6, 9, 5, 1, 4, 3, 8}};
		
	    //System.out.println(s1);
			    
	    /*for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<=arr.length;j++)
	    	{
	    		System.out.print(squares[i][j]+"\t");
	    	}
	    	System.out.println();
	    }*/
	    int min = Integer.MAX_VALUE;
	    for(int i=0;i<squares.length;i++)
	    {
	    	int total = 0;
	    	for(int j=0;j<squares[i].length;j++)
	    	{
	    		total += Math.abs(s[j/3][j%3]-squares[i][j]);
	    	}
	    	if(total < min)
	    		min = total;
	    }
		//System.out.println(min);
	    int m = 2%6;
		System.out.println(m);
	}
}
