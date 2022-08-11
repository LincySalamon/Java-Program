package MarupadiPgm;

public class Q4_BitwiseEx {
	public static void main(String[] args) {
		int x=10,y=12;
		System.out.println("x & y = " + (x&y));
		System.out.println("x & y = " + (x|y));
		System.out.println("x & y = " + (x^y));
		System.out.println("~x = " + (~x));//it is a bitwise one's complement 
		//x = 1010 => (1010 +1)=1011 so it gives a value like -11
	}
}
