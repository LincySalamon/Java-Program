import java.util.Scanner;
public class FormattedOutput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String str = "";
    System.out.println("================================");
    for(int i=0;i<3;i++){
        String s1=sc.next();
        int x=sc.nextInt();
        //Complete this line
        int temp =x;
        int count =0;
        if(temp >= 0)
        {
            temp /=10;
            count++;
        }
        if(count == 2 || count == 1)
        {
            str = String.format("%03d",x);
        }
        
        if(count == 2 || count == 1)
            System.out.printf("%-15s %s\n", s1, str);
        else
            System.out.printf("%-15s %s\n", s1, x);
    }
    System.out.println("================================");
}
}
