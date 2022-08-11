package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//import org.json.JSONArray;
//import org.json.JSONObject;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;


public class JSONFileRead { 
	public void jsonFileRead() { 
		try {
			
			JSONParser parser = new JSONParser();   
			FileReader fileReader = new FileReader("E://Marupadi_JAVA//FileIOStream//jsonfile1.json");
			JSONObject jsonObj = (JSONObject) parser.parse(fileReader);
			System.out.println(jsonObj);  
			 
			String name = (String) jsonObj.get("name");
			System.out.println("NAME:\t\t"+name);
				
			String course = (String) jsonObj.get("course");
			System.out.println("Course:\t\t"+course);
				
			String dept = (String) jsonObj.get("department");
			System.out.println("Course:\t\t"+dept);
			 
			long yearOfStudy = (long) jsonObj.get("year");
			System.out.println("StudiedYear:\t"+yearOfStudy);
			
			JSONArray subject = (JSONArray) jsonObj.get("subject"); 
			System.out.println("Choosed Subjects:");
			for(int i=0;i<subject.size();i++)
			{
				System.out.println(subject.get(i)); 
			}
			
			//String name1 = name.toUpperCase();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		new JSONFileRead().jsonFileRead();
	}

}
