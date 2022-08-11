package com.HackerRank;

public class AppendAndDelete {
	private String appendDelete(String s, String t, int k) {
		//int a[] = new int[]{1,2,3,4,5};
		int sIndex = 0;
        int tIndex = 0;
        while(sIndex < s.length() && tIndex < t.length())
        {
            if(s.charAt(sIndex) == t.charAt(tIndex))
            {
                sIndex++;
                tIndex++;
            }
            else  
            {
            	break;
            }
        }
        int minOperation = 0;
        minOperation = s.length()-sIndex + t.length()-tIndex;
        System.out.println(minOperation);
        if(k < minOperation){return "No";}  
        if(k >= s.length()+t.length()){return "Yes";}
        //if min operation = 0 or = k
        if((k-minOperation)%2 == 0){return "Yes";} 
        return "No";  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
		String t = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
		int k = 20;
		String str = new AppendAndDelete().appendDelete(s,t,k);
		System.out.println(str);
	}

	

}
