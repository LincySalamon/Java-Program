package zohoset3interviewqstn;

import java.util.Scanner;

public class SubStringFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubStringFind().findSubString();
	}

	public void findSubString() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the sub string to find: ");
		String str2 = sc.nextLine();
		
		int val = str1.indexOf(str2);
		int len1 = str1.length();
		int len2 = str2.length();
		
		for(int i=0;i<len1;i++)
		{
			
		}
		
		
//		if(val == -1)
//		{
//			System.out.println(str2+" is not present in the str1");
//		}
//		else
//		{
//			System.out.println(str2+" is present in the str1 at "+val+" index");
//		}
	}

}
