package com.NandhaSan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("C:\\Users\\LINCY SALAMON\\OneDrive\\Desktop\\Example_FileIO.txt");
		Scanner sc;
		int count = 0;
		try {
			sc = new Scanner(myFile);
			while(sc.hasNextLine())
			{
				String data = sc.nextLine(); 
				String[] word = Pattern.compile("\\s+").split(data); 
				System.out.println(data);
				System.out.println(myFile.length());
				System.out.println("File has "+word.length+" words");
				count++;
			}
			System.out.println("No of lines in a file "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
