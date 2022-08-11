package com.lIIpreperation;

public class EncryptString {

	public static void main(String[] args) {
		new EncryptString().findString();
	}
	private void findString() {
		int num = 11;
		//System.out.println(Integer.toHexString(num));
		String str = "abc";//"aaaaaaaaaaa";
		StringBuilder ans = new StringBuilder();
		int len = str.length();
		
		for(int i=0;i<len;i++)
		{
			char ch = str.charAt(i);
			int count = 0;
			String hex;
			
			while(i<len && str.charAt(i) == ch)
			{
				count++;
				i++;
			}
			i--;
			hex = Integer.toHexString(count);
			//System.out.println(hex);
			ans.append(ch);
			ans.append(hex);
		}
		ans.reverse();
		System.out.println(ans.toString());
	}

}
