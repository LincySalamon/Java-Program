package MarupadiPgm;
import java.util.Scanner; 
class Q1_MultiTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter Which table you want");
    int num = sc.nextInt();
    sc.close();
    int j =1,count =0;
    System.out.printf("Multiplication table for num %d is \n",num);
    for(int i=1;i<=10;i++)
      {
        System.out.printf("%d * %d = %d \n",num,i,num*i);
      }
    j = num;
    System.out.printf("Subtraction table for num %d is \n",num);
    while(count < 10)
      {
        System.out.printf("%d - %d = %d \n",j,num,j-num);
        count++;
        j++;
      }
  }
}