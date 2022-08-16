package ElectronicShop;

import java.util.Scanner;

public class AdminPage {

	public void adminView(String name) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("1. Add Items to your SHOP");
			System.out.println("2. View Items in your SHOP");
			System.out.println("3. Exit");
			String choice = sc.nextLine();
			if(choice.length() == 1 && Character.isDigit(choice.charAt(0)))
			{
				int choose = Integer.parseInt(choice);
				switch (choose) {
				case 1: { 
					new AdminAddItems().addItems();
					break;
				}
				case 2: {
					new AdminViewItems().viewItems(name);
					break;
				}
				case 3: {
					isTrue = false;
					break;
				}
				default:
					System.out.println();
					System.out.println("!!! Enter a valid choice !!!");
					break;
				}
			}
		}
	}

}
