package com.SathisKumarSan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class Example{
	int num; 
	String str;
	ArrayList<Integer> al = new ArrayList<Integer>();
}
public class ComparatorEx implements Comparator<Example> { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		Example ex = new Example();
		ex.num = 10;
		ex.str = "Happy"; 
		h.put(ex.num, ex.str);
		Example ex1 = new Example();
		ex1.num = 11;
		ex1.str = "Sad";
		h.put(ex1.num, ex1.str);
		Example ex2 = new Example();
		ex2.num = 12;
		ex2.str = "AAA";
		h.put(ex2.num, ex2.str);
		
		System.out.println(h);
	}

	@Override 
	public int compare(Example o1, Example o2) {
		// TODO Auto-generated method stub
		return o1.str.compareTo(o2.str); 
	}

}
