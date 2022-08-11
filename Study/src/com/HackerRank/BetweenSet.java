package com.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */ 
    public int findLcm(int n1,int n2){
        if(n1 == 0 || n2 == 0)
            return 0;
        else{
           int returngcd = findGcd(n1,n2);
           int returnlcm = Math.abs((n1*n2)/returngcd);
           return returnlcm;
        }
    }
    public int findGcd(int num1,int num2){
        if(num2 == 0)
            return 0;
        return findGcd(num2,num1%num2);
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        Result res = new Result();
        int result =0;
        int lcm = a.get(0);
        for(Integer i : a)
        {
            lcm = res.findLcm(lcm,i);
        }
        int gcd = b.get(0);
        for(Integer j : b)
        {
            gcd = res.findGcd(gcd,j);
        }
        int multiple=0;
        while(multiple <= gcd)
        {
            multiple += lcm;
            if(gcd % lcm == 0)
                result += 1;
        }
    return result;
    }
   
}

public class BetweenSet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

