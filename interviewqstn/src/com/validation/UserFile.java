package com.validation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.JSONObject;
import org.json.JSONWriter;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UserFile {

	public static void main(String[] args) {
		new UserFile().addUserData();
	}

	private void addUserData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		String uname = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		sc.close();
		JSONObject valObj = new JSONObject();
		valObj.put("UserName", uname);
		valObj.put("Password", password);
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject obj = (JSONObject) parser.parse(new FileReader("E://Marupadi_JAVA//UserLoginData.json"));
			JSONArray objArr = new JSONArray();
			objArr.add(obj);
			Iterator<JSONArray> iterator = objArr.iterator();
			while(iterator.hasNext())
			{
				String name = iterator.next().toJSONString();
				System.out.println(name);
			}
			FileWriter fw = new FileWriter("E://Marupadi_JAVA//UserLoginData.json",false);
			JSONWriter jw = new JSONWriter(fw);
			while (iterator.hasNext()) {
				obj.put("UserNmae", uname);
				obj.put("Password", password);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	} 

}
