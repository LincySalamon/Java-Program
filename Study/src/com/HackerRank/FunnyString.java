package com.HackerRank;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bcxz";
		int len = s.length();
        char[] ch = s.toCharArray();
        int[] chRev = new int[len];
        
        int k =0;
        for(int i=len-1;i>=0;i--)
        {
            chRev[k] = (int) ch[i];
            k++;
        }
       
        int[] chArr = new int[len];
        int n=0;
        for(int i=0;i<len;i++)
        {
        	chArr[n] = (int) ch[i];
        	n++;
        }
        for(int i=0;i<len;i++)
        {
        	System.out.print(chRev[i]+" ");
        }
        System.out.println();
        for(int i=0;i<len;i++)
        {
        	System.out.print(chArr[i]+" ");
        }
        System.out.println();
        int[] intArr = new int[len-1];
        int j=0;
        for(int i=0;i<len-1;i++)
        {
        	intArr[j] = chRev[i] - chRev[i+1];
        	j++;
        }
        int[] intArr1 = new int[len-1];
        int a=0;
        for(int i=0;i<len-1;i++)
        {
        	intArr1[a] = chArr[i+1] - chArr[i];
        	a++;
        }
        for(int i=0;i<len-1;i++)
        {
        	System.out.print(intArr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<len-1;i++)
        {
        	System.out.print(intArr1[i]+" ");
        }
        int count = 0;
        for(int x=0;x<len-1;x++)
        {
        	if(intArr[x] == intArr1[x])
        		{
        			count++;
        		}
        		else
        			break;
        }
   
        if(count == len-1)
        	System.out.println("FUNNY");
        else
        	System.out.println("NOT FUNNY");
	}

}
