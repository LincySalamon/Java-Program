package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>(); 
		map.put(1, "Lincy");
		map.put(2, "Salamon");
		map.put(3, "Jad");
		map.putIfAbsent(4, "Tony");
		//System.out.println(map);{1=Lincy, 2=Salamon}
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
