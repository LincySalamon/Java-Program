import java.util.Scanner; 
import java.lang.Math; 
public class ArmstrongNum
{
    public static void main(String[] args) {
        //System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit to find Armstrong number:");
        int n = sc.nextInt();
        sc.close();
        int temp,temp1,digit=0,rem=0,sum=0;
        temp = n;
        for(int i=0;i<=n;i++)
        {
            while(temp>0)
            {
                temp = temp/10;
                temp++;
            }
            temp1 = n;
            while(temp1>0)
            {
                rem = temp%10;
                sum += (Math.pow(rem,digit));
                temp = temp/10;
            }
            if(n == sum)
            {
                System.out.println("Armstrong number upto "+n+" are: "+i);
            }
        }
    }
}
