package com.DhanasreeSan;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for (int k=n-i; k>1; k--)  //it's important to memory 
            {  
                System.out.print(" ");   
            }   
            for(int j=0;j<=i;j++)
            {
                System.out.print(" *");//put space in * it print pyramid without space it print left triangle 
            }
            System.out.println();//new line 
        }
	}
}
