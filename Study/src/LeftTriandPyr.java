import java.util.Scanner; 
public class LeftTriandPyr
{
    public static void main(String[] args) {
        //System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for (int k=n-i; k>1; k--)  //it's important to memory 
            {  
                System.out.print(" ");   
            }   
            for(int j=0;j<=i;j++)
            {
                System.out.print(" *");//put space in * it print pyramid without space it print left triangle 
            }
            System.out.println();//new line 
        }
    }
}
/*
  Arrays.sort(ar);
        int candles = 0, longest = ar[ar.length-1];
        for(int i = ar.length-1; i >= 0; i--){
            if(longest == ar[i]){
                candles = candles + 1;
            }else{
                break;
            }
        }
        return candles;
*/
