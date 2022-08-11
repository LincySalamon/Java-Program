package com.SathisKumarSan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//remove Even integers from an Array. 
//Example: Sample Input  {1, 2, 4, 5, 10, 6, 3}Output:  {1, 5, 3}

public class RemoveEvenInteger {

	private void removeEvenInt() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values in an array");
		int num = sc.nextInt();
		List<Integer> valArr = new ArrayList<Integer>();        
		System.out.println("Enter the values of array");
		for(int i=0;i<num;i++)  
		{ 
			valArr.add(i,sc.nextInt());
		}   
		int size = valArr.size();
		 
//		for(int i=0;i<valArr.size();i++)  
//		{   
//			if(valArr.get(i)%2 == 0)
//			{    
//				System.out.println(valArr.remove(i));
//				continue;
//			}
//		}
		for(Iterator<Integer> iterator = valArr.iterator(); iterator.hasNext();)
		{
			Integer number = iterator.next();
			if(number % 2 == 0)
			{
				//System.out.println(number);
				iterator.remove();
			}
		}
		
		Collections.sort(valArr);
		for(int i=0;i<valArr.size();i++)
		{
			System.out.print(valArr.get(i)+"  ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RemoveEvenInteger().removeEvenInt();
	}
}
