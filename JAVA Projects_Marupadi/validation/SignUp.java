package com.validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;

import org.json.JSONArray;
import org.json.JSONObject;

import com.lIIpreperation.Pattern;

public class SignUp {

	public void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("In signup page");
		String uname = "";
		String password = "";
		String repassword = "";
		int i=0;
		int count =0;
		while(i<3)
		{
			if(i==0)
			{
				System.out.println("Enter Username");
				uname = sc.nextLine();
				i++;
			}
			else if(i==1)
			{
				System.out.println("Enter Password");
				System.out.println("Password must contains\n1.Atleast 8 characters\n2.Atleast one digit\n3.Atleast one upper and lower case"
						+ "\n4.Special character !@#$%&*()-+=^\n5.Doesn't contain any white space");
				password = sc.nextLine();
				i++;
			}
			else if(i==2)
			{
				System.out.println("Re enter password");
				repassword = sc.nextLine();
				String regex = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=.*[@#$%^&+=])"
	                       + "(?=\\S+$).{8,20}$"; 
				java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);
				Matcher m = p.matcher(password);
				Matcher m1 = p.matcher(repassword);

				if(m.matches()== true && m1.matches()==true && password.equals(repassword))
				{
					JSONObject obj = new JSONObject();
					obj.put("UserName", uname);
					obj.put("Password", password);
					
					File userdetails = new File("E://Marupadi_JAVA//UserLoginData.json");
					try {
						if(!(userdetails.exists())) 
						{
							userdetails.createNewFile();   
						}
						FileWriter fw = new FileWriter(userdetails,true);
						JSONArray objArr = new JSONArray(); 
						
						if(userdetails.length() !=0) 
						{
							fw.append(objArr.put(obj).toString());
						}
						//pw.append(objArr.put(obj).toString());
						System.out.println("User Registered Successfully!!!!!");
						fw.close();
						
					}catch(IOException e) {
						e.printStackTrace();
					}
					i++;
				}
				else if(m.matches() == false && password.equals(repassword)) {
					System.out.println("Please Enter a correct way of password please check the credentials");
					i=1;
					count++;
					if(count > 2)
					{
						System.out.println("Maximun limit exceeds");
						i++;
					}
				}
				else {
					System.out.println("Password didn't match!!!Please enter a correct password");
					i=2;
					count++;
					if(count > 2)
					{
						System.out.println("Maximun limit exceeds");
						i++;
					}
				}
			}
		}
	}

}
