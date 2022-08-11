package zohoset3interviewqstn;

import java.util.Scanner;

public class WriteChBasedOnNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WriteChBasedOnNum().writeChar();
	}

	private void writeChar() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number followed by character: ");
		System.out.println("Ex: 'a2b10'");
		System.out.println("Number should varies from 1 to 99");
		String str = sc.nextLine();
		
		char num[] = new char[10];
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
				num[index++] = str.charAt(i); 
			}
		}
		
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"  ");
		}
	}

}
