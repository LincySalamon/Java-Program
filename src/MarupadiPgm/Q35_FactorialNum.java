package MarupadiPgm;
import java.util.Scanner;
public class Q35_FactorialNum {
	public static void main(String[] args) {
        //System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i = 1;i<=n;i++)
        {
            fact = fact * i;
            //System.out.println("fact == "+fact);
        }
        int num = fact,digit,sum=0;
        while(num>0 )
        {
        	 digit = num % 10;
        	 sum = sum + digit;
        	 num = num/10;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        System.out.println("Sum of Factorial number "+fact+" digit is "+sum);
	}
}