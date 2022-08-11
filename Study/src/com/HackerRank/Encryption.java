package com.HackerRank;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "have a nice day is for you man";
		String newStr = str.replaceAll("\\s","");
		System.out.println(str);
		System.out.println(newStr);
		int len = newStr.length();//23
		System.out.println(len);
		char[] ch = newStr.toCharArray();
		double rootVal = Math.sqrt(len);
		int row = (int) Math.ceil(rootVal);
		int column = row+1;
		System.out.println(row);
		//System.out.println(rootVal+"    "+column);//3,4
		char[][] res = new char[row][column];
		//System.out.println(res.length);
		int k=0;
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(k<len) {
					res[i][j] = ch[k++];
				}
				else
					res[i][j] = ' ';
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i+j < len) {
					System.out.print(res[i][j]+"\t");
				}
			}
			System.out.println();
		}
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(res[j][i]);
			}
		}
		String strRes = String.valueOf(res);
		System.out.println(strRes);
	}

}
