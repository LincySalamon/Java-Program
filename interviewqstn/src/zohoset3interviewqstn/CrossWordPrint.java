package zohoset3interviewqstn;

import java.util.Scanner;

//Given a string of odd length, print the string X format
public class CrossWordPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CrossWordPrint().printWordCross();
	}

	private void printWordCross() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String with odd length");
		String str = sc.nextLine();
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i==j || (i+j == len-1))
					System.out.print(str.charAt(j));   
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
