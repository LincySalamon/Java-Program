

import java.util.Scanner;

public class SelectRecords {

	public static void main(String[] args) {
		new SelectRecords().findRecords();
	}

	private void findRecords() {
		Scanner sc = new Scanner(System.in);
		int n=4,m = 4;
		int[][] records = new int[][] {{1,22,33,44},{2,45,67,89},{3,21,54,78},{4,67,98,11}};
		printRecords(records,n,m);
		System.out.println("Choose Column 1.*\t2.A\t3.B\t4.c");
		char col = sc.next().charAt(0);
		sc.nextLine();
		
		switch (col) {
		case '1': {
			System.out.println("Enter Criteria/conditions");
			String condition = sc.nextLine();
			int select = (int)col-48;
			splitVal(condition,records,select);
			break;
		}
		case '2': {
			System.out.println("Enter Criteria/conditions");
			String condition = sc.nextLine();
			int select = (int)col-48;
			splitVal(condition,records,select);
			break;
		}
		case '3': {
			System.out.println("Enter Criteria/conditions");
			String condition = sc.nextLine();
			int select = (int)col-48;
			splitVal(condition,records,select);
			break;
		}
		case '4': {
			System.out.println("Enter Criteria/conditions");
			String condition = sc.nextLine();
			int select = (int)col-48;
			splitVal(condition,records,select);
			break;
		}
		default:
			System.out.println("Enter a valid choice");
		}
		sc.close();
	}

	private void splitVal(String condition,int[][] records,int select) {
		String[] criteria;
		
		if(condition.contains("<"))
		{
			criteria = condition.split("<");
			findConditionValue(criteria,"<",records,select);
		}
		else if(condition.contains(">"))
		{
			criteria = condition.split(">");
			findConditionValue(criteria,">",records,select);
		}
		else if(condition.contains("="))
		{
			criteria = condition.split("=");
			findConditionValue(criteria,"=",records,select);
		}
	}

	private void findConditionValue(String[] criteria, String operator,int[][] records,int select) {
		char col = criteria[0].charAt(0);
		String str = criteria[1];
		int value = (((int)str.charAt(0)-48)*10)+((int)str.charAt(1)-48);
		
		if(col == 'a' || col == 'A')
		{
			int column = 1;
			findColumn(column,records,operator,value,select);
		}
		if(col == 'b' || col == 'B')
		{
			int column = 2;
			findColumn(column, records,operator,value,select);
		}
		if(col == 'c' || col == 'C')
		{
			int column = 3;
			findColumn(column, records,operator,value,select);
		}
	}

	private void findColumn(int column, int[][] records,String operator,int value,int select) {
		int len = records.length;
		
		if(operator.equals(">"))
		{
			for(int i=0;i<len;i++)
			{
				for(int j=column;j<=column;j++)
				{
					if(records[i][j] > value)
					{
						if(select == 1)
							printValue(i,records);
						else
							System.out.print(records[i][j]);
						System.out.println();
					}
				}
			}
		}
		else if(operator.equals("<"))
		{
			for(int i=0;i<len;i++)
			{
				for(int j=column;j<=column;j++)
				{
					if(records[i][j] < value)
					{
						if(select == 1)
							printValue(i,records);
						else
							System.out.print(records[i][j]);
						System.out.println();
					}
				}
			}
		}
		else if(operator.equals("="))
		{
			for(int i=0;i<len;i++)
			{
				for(int j=column;j<=column;j++)
				{
					if(records[i][j] == value)
					{
						if(select == 1)
							printValue(i,records);
						else
							System.out.print(records[i][j]);
						System.out.println();
					}
				}
			}
		}
	}

	private void printValue(int row, int[][] records) {
		int len = records.length;
		
		for(int i=row;i<=row;i++)
		{
			for(int j=0;j<len;j++)
			{
				System.out.print(records[i][j]+"  ");
			}
		}
	}

	private void printRecords(int[][] records,int n,int m) {
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(records[i][j]+" ");
			}
			System.out.println();
		}
	}

}
