package MarupadiPgm;
import java.util.Scanner;
public class Q13_AreaSq {
	static void AreaofSquare(float side)
	{
		double val;
		val = side * side;
		System.out.println("Area of square is "+val+"sq");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of Square: ");
		float side = sc.nextFloat();
		sc.close();
		AreaofSquare(side);
	}
}
