package MarupadiPgm;
import java.util.Scanner;
public class Q30_LargestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the Third number: ");
		int n3 = sc.nextInt();
		sc.close();
		int temp,largest;
		temp = n1>n2?n1:n2;
		largest = n3>temp?n3:temp;
		System.out.println("The largest number is: "+ largest);
	}
}
