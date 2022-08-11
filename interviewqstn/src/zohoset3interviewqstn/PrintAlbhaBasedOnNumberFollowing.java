package zohoset3interviewqstn;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAlbhaBasedOnNumberFollowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintAlbhaBasedOnNumberFollowing().printAlbha();
	}

	private void printAlbha() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string like 'a1b10'");
		String str = sc.nextLine();
		ArrayList<Character> chArr = new ArrayList<>();
		ArrayList<Integer> intArr = new ArrayList<>();
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i)<='9') 
			{
				intArr.add((int) str.charAt(i)-48);
				
//				if(str.charAt(i+1)>='0' && str.charAt(i+1)<='9')
//				{
//					char ch = (char) (str.charAt(i)+str.charAt(i+1));
//					intArr.add((int) ch-48);
//				}
			}
			else {
				chArr.add(str.charAt(i));
			}
		}
		//System.out.println(intArr);
		//System.out.println(chArr);
		
		for(int i=0;i<intArr.size();i++)
		{
			for(int j=0;j<intArr.get(i);j++)
			{
				System.out.print(chArr.get(i));
			}
		}
	}

}
