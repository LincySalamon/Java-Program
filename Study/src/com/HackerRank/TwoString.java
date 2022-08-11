package com.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    // Write your code here
        int len1 = s1.length();
        int len2 = s2.length();
        /*int count =0;
        int smallLen = (len1<len2?len1:len2);
        
        for(int i=0;i<smallLen;i++)
        {
            if(s2.contains(charAt(i))){
                count++;
                break;
            }
        }
        if(count >0)
            return "YES";
        else
            return "NO";*/
        //vector for storing ch occurance
        int MAX_CHAR = 26;
        boolean v[] = new boolean[MAX_CHAR];
        Arrays.fill(v,false);
        //increment vector index for evevry same ch occur
        for(int i=0;i<len1;i++)
        {
            v[s1.charAt(i)-'a'] = true;
        }
        //check common sub string in s2
        for(int i=0;i<len2;i++)
        {
            if(v[s2.charAt(i)-'a'])
                return "YES";
        }
        return "NO";
    }

}

public class TwoString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String Result = Result1.twoStrings(s1, s2);

                bufferedWriter.write(Result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
