

import java.util.ArrayList;
import java.util.Scanner;

public class CheckRightTriangle {

	public static void main(String[] args) {
		new CheckRightTriangle().printTriangle();
	}

	private void printTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int N = sc.nextInt();
		ArrayList<Integer> limit = new ArrayList<Integer>();
		limit.add(1);
		
		for(int i=2;i<=N;i++)
		{
			int val = limit.get(i-2)+i;
			
			if(val <= N)
				limit.add(val);
			else
				break;
		}
		//System.out.println(limit);
		
		//code for print triangle
		int n;
		n = N;
		int num = 1;
		
		//System.out.println(limit.contains(n));
		//System.out.println(limit.indexOf(n));
		
		int maxLimit = limit.indexOf(n);
		if(limit.contains(n))
		{
			for(int i=1;i<=maxLimit+1;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(num+++" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Cannot form right triangle");
	}

}
