package zohoset3interviewqstn;

import java.util.Scanner;

public class PerformOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PerformOperation().operationBasedOnRespectiveOrder();
	}

	private void operationBasedOnRespectiveOrder() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "374291--*+-";
		//int output = 16;
		char ch[] = str.toCharArray();
		int len = ch.length;
		int l=0,k=0,c,b,d=1,j=0;
		for(int i=0;i<len;i++)
		{
			if(ch[i]>=48 && ch[i]<=58)
			{
				if(l==0)
					k++;
				else {
					j=1;
					break;
				}
			}
			else {
				l++;
			}
		}
		if(k!=l+1 || j==1) {
			System.out.println("Input is wrong");
		}
		else {
			l = 0;
			b = ch[0]-48;
			for(int i=1;i<k;i++)
			{
				c = ch[i]-48;
				switch(ch[k+1])
				{
					case '+' :{b=b+c;break;}
					case '-' :{b=b-c;break;}
					case '*' :{b=b*c;break;}
					case '/' :{
						if(c==0) {System.out.println("Abnormal state"); d=0;}
						b=b/c;
						break;
					}
				}
				if(d==0) {
					break;
				}
				l++;
			}
			if(d!=0) {
				System.out.println(b);
			}
		}
	}

}
