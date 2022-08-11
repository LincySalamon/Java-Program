import java.util.Arrays;  
public class Anagram
{
    public static void main(String[] args) {
        //System.out.println("Welcome to Online IDE!! Happy Coding :)");
        String str1 = "Grab";
        String str2 = "Brag";//(o/p==>Grab-grab-then sort abgr then compare to the next str with same process if 
        //both sorting strings are equal the both stings are anagram)
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //System.out.println(str1);
        if(str1.length() != str2.length())
        {
            System.out.println("Both the string is not an anagram");
        }
        else
        {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            //System.out.println(ch[0]);
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            //System.out.println(ch1[0]);
            if(Arrays.equals(ch1,ch2) == true)
            {
                System.out.println("Both Strings are anagram");
            }
            else{
                System.out.println("Both Strings are not anagram");
            }
        }
    }
}