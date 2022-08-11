package com.NandhaSan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"C:\Users\LINCY SALAMON\OneDrive\Desktop\ExampleFileIO.txt"
		try {
			File myFile = new File("C:\\Users\\LINCY SALAMON\\OneDrive\\Desktop\\Example_FileIO.txt");
			//create file
			if(myFile.createNewFile())
			{
				System.out.println("File Created "+myFile.getName());
			}
			else
			{
				System.out.println("File already exsists");
			}
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}	
	}
}
