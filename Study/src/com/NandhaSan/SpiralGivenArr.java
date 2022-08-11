package com.NandhaSan;
import java.util.*;

class spiralGivenArr
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int column =sc.nextInt();
      int[][] arr = new int[row][column];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      int i=0;int j = column-1;
      
      int l = column/2;int h = column/2;
      //for odd columns
      if(column%2 == 0)
      {
        l = column/2-1;
        h= column/2;
      }
      //l = 1 ;h = 2
      while((i<=l)&&(j>=h))
        {
            if( (i==j) && (i== column/2) && (column%2 != 0))
            {
                System.out.println(arr[i][j] + " ");
                break;
            }
          //printing first row
          int q = i;
          for(int p =0+i;p<=j;p++)
            {
                // System.out.println("q: "+q+"p :"+p);
              System.out.print(arr[q][p]+ " ");
            }
            System.out.print("\n");
          //printing last column
          q = j;
           for(int p =i+1;p<=j;p++)
            {
                // System.out.println("q: "+q+"p :"+p);
              System.out.print(arr[p][q]+ " ");
            }
            System.out.print("\n");
          //printing last row
          q = j;
           for(int p=j-1;p>=i;p--)
            {
                // System.out.println("q: "+q+"p :"+p);
              System.out.print(arr[q][p]+ " ");
            }
            System.out.print("\n");
          //printing first column
           q = i;
           for(int p=j-1;p>i;p--)
            {
                // System.out.println("q: "+q+"p :"+p);
              System.out.print(arr[p][q]+ " ");
            }
            System.out.print("\n");
            i++;
            j--;
        }
      
    }
  }