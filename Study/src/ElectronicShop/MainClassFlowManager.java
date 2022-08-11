package ElectronicShop;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainClassFlowManager {

	public void ApplicationStart() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) { 
			System.out.println("*************************");
			System.out.println("*****ELECTRONIC SHOP*****");
			System.out.println("*************************");
			System.out.println("        New User? SIGN UP");
			System.out.println();
			System.out.println("Press 1 for Sign Up");
			System.out.println();
			System.out.println("Already User?");
			System.out.println();
			System.out.println("Press 2 for LOGIN");
			System.out.println();
			System.out.println("3. Admin Login");
			System.out.println();
			System.out.println("5 for Exit");
			
			String choose = sc.nextLine();//"123"
			if(choose.length() == 1 && Character.isDigit(choose.charAt(0)))
			{
				byte choice = Byte.parseByte(choose);
				
				switch (choice) {
				case 1: {
					SignUpPage sp = new SignUpPage();
					sp.signUp();
					//new SignUpPage().signUp();
					break;
				}
				case 2: {
					new SignUpPage().login();
					break;
				}
				case 3: {
					new SignUpPage().adminLogin();
					break;
				}
				case 5: {
					isTrue = false;
					break;
				}
				default:
					System.out.println();
					System.out.println("!!! Enter a valid choice !!!");
					break;
				} 
			}
			else {
				System.out.println("Enter Valid Choice");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DataList().mobileList(); 
		new DataList().laptopList();
		new MainClassFlowManager().ApplicationStart();
	}

}
