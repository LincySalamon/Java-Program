package com.NandhaSan;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> val = new HashMap<Integer, Integer>(); 
		val.put(1, 1);val.put(2, 2);val.put(3, 3);val.put(4, 4);val.put(4, 4);
		HashMap<Integer, Integer> val1 = new HashMap<>(); 
		val1.put(1, 1);val1.put(2, 2);val1.put(3, 3);val1.put(4, 4);val1.put(4, 4);
		
		HashSet<HashMap<Integer, Integer>> set1 = new HashSet<HashMap<Integer, Integer>>(); 
		set1.add(val);
		set1.add(val1);
		System.out.println(set1);
		System.out.println(val.hashCode());
		System.out.println(val1.hashCode());
	}
}