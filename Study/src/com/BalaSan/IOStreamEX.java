package com.BalaSan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOStreamEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			double number = Double.parseDouble(s);
			System.out.println("Number is "+number);
			
		}catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

}
