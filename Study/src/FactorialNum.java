import java.util.Scanner; 
public class FactorialNum
{
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
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
