
public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 99988877766655443322111
		int n = 9,count=0;
		printnum(n,count);
	}
	public static void printnum(int n,int count) {
		int num = n;
		int c = count;
		while(num >= 1 || count == 27) {
			for(int i=0;i<3;i++)
			{
				System.out.print(num);
				c=c*1;
			}
			printnum(--num,c);
		}
	}
}
