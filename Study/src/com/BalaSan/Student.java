package com.BalaSan;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.addDetails();
		 
	}

	private void addDetails() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students to be added:");
		int num = sc.nextInt();
		int i=0;
		StudentDetail[] stuObj = new StudentDetail[num];
		 
		while(i<num)
		{
			StudentDetail sd = new StudentDetail();
			System.out.println();
			System.out.println("Enter the Student name:");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Enter the student id:");
			System.out.println();
			int id = sc.nextInt();
			sd.setName(name);
			sd.setId(id); 
			stuObj[i] = sd;
			
			i++;
		}sc.close();
		
		for(int j=0;j<num;j++)
		{
			System.out.print(stuObj[j]+" ");
		}System.out.println();
		
		for(int k=0; k<stuObj.length; k++)   {  
	        StudentDetail temp = stuObj[k];      
	        int j= k-1;  
	        while(j>=0 && temp.getId() <= stuObj[j].getId())   {  
	        	stuObj[j+1] = stuObj[j];
	        	j = j-1;    
	        }   
	        stuObj[j+1] = temp;    
	    }  
		
		for(int l =0;l<num;l++) 
		{
			System.out.print(stuObj[l].getId()+" :"+stuObj[l].getName());
			System.out.println();
		}
	}

}
