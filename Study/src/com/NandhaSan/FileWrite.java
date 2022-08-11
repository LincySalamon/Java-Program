package com.NandhaSan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myFile = new File("C:\\Users\\LINCY SALAMON\\OneDrive\\Desktop\\Example_FileIO.txt");
			FileWriter writeData = new FileWriter(myFile);
			writeData.write("Again write from app");
			writeData.close();
			System.out.println("Successfully wrote to the file.");
		} 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}	
		
	}

}
