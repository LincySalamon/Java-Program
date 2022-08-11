package com.lIIpreperation;

public class MinDistBeweenTwoWordsInArray {

	public static void main(String[] args) {
		String s = "the quick brown fox quick";//"geeks for geeks contribute practice";
		String w1 = "the"; //"geeks";
		String w2 = "fox"; //"practice";
		System.out.println(findDistance(s,w1,w2));
	}

	public static int  findDistance(String s, String w1, String w2) {
		if(w1.equals(w2)) 
			return 0;
		String words[] = s.split(" ");
		int minDist = words.length +1;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(w1)) 
			{
				for(int j=0;j<words.length;j++)
				{
					if(words[j].equals(w2))
					{
						int currIndex = Math.abs((i-j));
						if(currIndex < minDist)
						{
							minDist = currIndex;
						}
					}
				}
			}
		}
		return minDist;
	}

}
