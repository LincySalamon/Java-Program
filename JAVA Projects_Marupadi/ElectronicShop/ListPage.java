package ElectronicShop;

import java.util.Scanner;

public class ListPage {
	public void listPage(String name) {
		System.out.println("In list page");
		Scanner sc = new Scanner(System.in);
		Boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("Which Item You want to visit and Buy");
			
			System.out.println("1.MOBILE");
			System.out.println("2.LAPTOP");
			System.out.println("3.Digital Watch");
			System.out.println("4.Exit");
			
			String choose = sc.nextLine();
			if(choose.length() == 1 && Character.isDigit(choose.charAt(0)))
			{
				byte choice = sc.nextByte();
				switch (choice) {
				case 1: { 
					new MobileDetails().mobileDetails(name,"MOBILE"); 
					break;
				} 
				case 2: {
					new MobileDetails().mobileDetails(name,"LAPTOP");
					break;
				}
				case 3: {
					break;
				} 
				case 4: {
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
}
