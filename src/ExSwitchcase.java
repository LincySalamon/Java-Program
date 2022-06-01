import java.util.Scanner;
public class ExSwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		boolean isConsonant = false;
		switch(ch) {
		case 'a' : System.out.println(ch+" is vowel");
				   //break;
		case 'e' : System.out.println(ch+" is vowel");
		   		   //break;
		case 'i' : System.out.println(ch+" is vowel");
		           //break;
		case 'o' : System.out.println(ch+" is vowel");
		           //break;
		case 'u' : System.out.println(ch+" is vowel");
		           //break;
		case 'A' : System.out.println(ch+" is vowel");
		           //break;
		case 'E' : System.out.println(ch+" is vowel");
		           //break;
		case 'I' : System.out.println(ch+" is vowel");
		           //break;
		case 'O' : System.out.println(ch+" is vowel");
		           //break;
		case 'U' : System.out.println(ch+" is vowel");
		           //break;
		default : System.out.println("In default");//isConsonant = true;
				   //break;
		}
		/*if(isConsonant == true && ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')))
			System.out.println(ch+" is Consonant");
		else
			System.out.println(ch+" is not an alphabet");*/
	}

}
