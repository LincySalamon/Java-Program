package MarupadiPgm;

public class Q18_Expression {
	public static void main(String[] args) {
		int a=1,b=11;
		int c=10,d=6;
		int x=9,y=3;
		System.out.println(++a-b);
		//System.out.printf("%d,%d\n",a,b);//2,11
		
		System.out.println(c%d);
		//System.out.printf("%d,%d\n",c,d);//2,12
		
		System.out.println(x*=y+5);
		System.out.println(x=69>>>2);
	}
}
