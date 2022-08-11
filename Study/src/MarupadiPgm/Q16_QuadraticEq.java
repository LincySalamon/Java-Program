package MarupadiPgm;
import java.util.Scanner;
public class Q16_QuadraticEq {
	static void calculateD(double a,double b,double c) {
		if(a == 0) {
			System.out.println("Value cannot be 0 ");
			return;
		}
		double d = b*b - 4*a*c;
		double sqt = Math.sqrt(d);
		if(d > 0)
		{
			System.out.println("The roots of the equation are real\n");
			System.out.println((-b+sqt)/(2*a)+"\n"+(-b-sqt)/(2*a));
		}
		else if(d == 0)
		{
			System.out.println("The roots of the equation are real\n");
			System.out.println((-b)/(2*a)+"\n"+(-b)/(2*a));
		}
		else
		{
			System.out.println("The roots of the equation are complex\n");
			System.out.println(-b/(2*a)+ "+ i"+ sqt + "\n"+ -b/(2*a)+" - i" +sqt);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		double a =  sc.nextDouble();
		System.out.println("Enter the value of b: ");
		double b =  sc.nextDouble();
		System.out.println("Enter the value of c: ");
		double c =  sc.nextDouble();
		sc.close();
		calculateD(a,b,c);
	}
}
