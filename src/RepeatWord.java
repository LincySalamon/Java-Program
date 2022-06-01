
public class RepeatWord
{
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black a nose bug";
        int count;
        string = string.toLowerCase();
        String words[] = string.split(" ");
        /*for(int i =0;i<words.length;i++){
            System.out.println(words[i]);
        }*/
        int len = words.length;
        for(int i = 0; i<len;i++)
        {
            count =1;
            for(int j=i+1;j<len;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    words[j] = "0";//to avoid printing visited character
                }
            }
            if(count > 1 && words[i] != "0") {  
                System.out.println(words[i]);    
            }    
        }
    }
}
