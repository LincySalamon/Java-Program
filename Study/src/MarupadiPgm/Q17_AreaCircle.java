package MarupadiPgm;
import java.util.Scanner;
public class Q17_AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of inner circle:");
		float r1 = sc.nextFloat();
		System.out.println("Enter the radius of outter circle:");
		float r2 = sc.nextFloat();
		sc.close();
		double area1 = Math.PI * r1 * r1;
		double area2 = Math.PI * r2 * r2;
		double area = area2 - area1;
		System.out.println("Area of the space between 2 concentric circle is "+area);
	}
}
