package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		//default size = 10, load factor50%
		ArrayList<Integer> intList = new ArrayList<>();
		
		Collections.addAll(list, "a","b","c","d","e","f");
		System.out.println("List Value: "+list);
		Collections.reverse(list);
		System.out.println("ReverseList "+list);
		Collections.shuffle(list);
		System.out.println("Shuffle word: "+list);
		Collections.sort(list);
		System.out.println("Sorted array: "+list);
		int index = Collections.binarySearch(list, "c");
		System.out.println("Binary search index of c is: "+index);
		
		HashSet<String> hashset = new HashSet<String>();
		Collections.addAll(hashset, "a","bb","ccc","dddd","eeeee","ffffff");
		System.out.println("Hashset value: "+hashset);
		ArrayList<String> arrList = new ArrayList<String>(hashset);
		System.out.println("Set in ArrayList:"+arrList);
		hashset.add("oooooo");
		hashset.add("iiiiiiii");
		hashset.add("lllllllllll");
		System.out.println("ArrayList values: "+hashset);
		System.out.println(arrList);
	}

}
