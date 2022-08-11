package com.bankapplication;

import java.util.HashMap;
import java.util.Scanner;


public class SignUpPage {
	static HashMap<Long, User> userDetail = new HashMap<Long, User>();
	public void signup() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userName = "";
		String passWord = "";
		String rePassWord = "";
		Long mobile = null;
		//accNo = 10000003L;
		byte count=0;
		byte i = 0;
		
		while(i<4)
		{
			if(i==0)
			{
				System.out.println("Enter User Name: ");
				userName = sc.nextLine();
				i++;
			}
			else if(i==1)
			{
				System.out.println("Enter Mobile Number: ");
				mobile = sc.nextLong();
				sc.nextLine();
				i++;
			}
			else if(i==2)
			{
				System.out.println("Enter Password: ");
				passWord = sc.nextLine();
				i++; 
			}
			else if(i==3)
			{
				System.out.println("Re enter Password");
				rePassWord = sc.nextLine();
				if(!(passWord.equals(rePassWord)))
				{
					System.out.println("Password Did not match Enter Correctly");
					i = 3;
					count++;
					if(count>2)
					{
						System.out.println("MAXIMUM LIMITS EXCEEDS");
						i++;
					}
				}
				else {
					System.out.println("Signup sucessfully");
					User userObj = new User(userName,mobile,passWord);
					
					System.out.println("Hai "+userName+" Your Account number was created!!!!");
					System.out.println("Your Account Number is     "+userObj.getAccNum()); 
					userDetail.put(userObj.getAccNum(), userObj); 
					i++;
				}
			} 
		}
	}
}
