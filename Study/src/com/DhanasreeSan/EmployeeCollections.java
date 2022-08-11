package com.DhanasreeSan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeCollections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		String phoneno;
		Scanner in=new Scanner(System.in);
		//System.out.println("Enter no of employees");
		//int n=in.nextInt();
		List<Object> al=new ArrayList<Object>();
		System.out.println("Enter name age phoneno");
		name=in.next();
		age=in.nextInt();
		phoneno=in.next();
		al.add(name);
		al.add(age);
		al.add(phoneno);

		System.out.println("Employee details are");
		System.out.println();
		for(Object str : al)
		{
			System.out.print(str + "  ");
		}
	}
}
