package ElectronicShop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SignUpPage {
	int count=0;
	static protected LinkedHashMap<String, String> UserDataBase = new LinkedHashMap<String,String>();
	static protected LinkedHashMap<String, String> AdminDataBase = new LinkedHashMap<String, String>();
	protected static LinkedHashMap<String, HashMap<String, Double>> cartItems = new LinkedHashMap<String, HashMap<String,Double>>();
	//UserDataBase.put("User", "User10");
	public void signUp() {
		Scanner sc = new Scanner(System.in);
		String userName = "";
		String passWord = "";
		String rePassWord = "";
		byte count=0;
		byte i = 0;
		while(i<3)
		{
			if(i==0)
			{
				System.out.println("Enter User Name: ");
				userName = sc.nextLine();
				i++;
			}
			else if(i==1)
			{
				System.out.println("Enter Password: ");
				passWord = sc.nextLine();
				i++; 
			}
			else if(i==2)
			{
				System.out.println("Re enter Password");
				rePassWord = sc.nextLine();
				if(!(passWord.equals(rePassWord)))
				{
					System.out.println("Password Did not match Enter Correctly");
					i =2;
					count++;
					if(count>2)
					{
						System.out.println("Maximun limit exceeds");
						i++;
					}
				}
				else {
					UserDataBase.put(userName, passWord);
					i++;
				}
			} 
		}
	}

	public void login() {
		
		UserDataBase.put("User", "User10");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		String name = sc.nextLine();
		System.out.println("Enter Password");
		String passWrd = sc.nextLine();
		
		if(UserDataBase.containsKey(name) && UserDataBase.containsValue(passWrd))
		{
			new ListPage().listPage(name);
		}
		else
		{
			System.out.println("Username password doesn't match");
			count++;
			if(count < 3) {
				login();
			}
		}
	}

	public void adminLogin() {
		// TODO Auto-generated method stub
		
		AdminDataBase.put("Admin", "Admin");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Admin Name");
		String name = sc.nextLine();
		System.out.println("Enter Admin Password");
		String passWrd = sc.nextLine();
		//boolean isAdmin = true;
		if(AdminDataBase.containsKey(name) && AdminDataBase.containsValue(passWrd))
		{
			new AdminPage().adminView(name);
		}
		else
		{
			System.out.println("Admin password doesn't match");
			count++;
			if(count < 3) {
				login();
			}
		}
	}
}
