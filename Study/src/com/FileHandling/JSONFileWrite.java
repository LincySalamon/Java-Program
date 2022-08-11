package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

 
public class JSONFileWrite {
 
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("name", "Kavitha");
			obj.put("course", "BE");
			obj.put("department", "ECE");
			obj.put("year", 3);
			
			
			JSONArray list = new JSONArray();
			
			list.put("Maths 3");
			list.put("LIC");
			list.put("DataSTructure");
			 
			obj.put("subject", list);
			
			System.out.println(obj); 
			
			try (FileWriter file = new FileWriter("E://Marupadi_JAVA//FileIOStream//jsonfile2.json"))
			{
				file.write(obj.toString());
				file.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
