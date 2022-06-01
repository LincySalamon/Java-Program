package MarupadiPgm;

import java.util.Scanner;

public class Q14_RectangleArea {
	public static void AreaofRect(float l,float b) {
		double val;
		val = l * b;
		System.out.println("Area of rectangle is: "+ val);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of Rectangle: ");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		sc.close();
		AreaofRect(l,b);
	}
}
