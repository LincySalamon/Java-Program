package MarupadiPgm;

public class Q44_DublicateElement {
	public static void main(String[] args) {
        String string = "Augusty Jose Lincy";
        int count;
        char str[] = string.toCharArray();
        int len = str.length;
        for(int i = 0; i<len;i++)
        {
            count =1;
            for(int j=i+1;j<len;j++)
            {
                if(str[i] == str[j] && str[i] != ' ')
                {
                    count++;
                    str[j] = '0';//to avoid printing visited character
                }
            }
            if(count > 1 && str[i] != '0') {  
                System.out.println(str[i]);    
            }    
        }
           
    }
}
