package MarupadiPgm;
import java.util.Scanner;
public class Q15_CylinderArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder: ");
		float radius = sc.nextFloat();
		System.out.println("Enter the height of the cylinder: ");
		float height = sc.nextFloat();
		sc.close();
		double area = (2 * Math.PI * radius) * (height + radius);
		System.out.println("The Area of the cylinder is: "+ area);
	}
}
