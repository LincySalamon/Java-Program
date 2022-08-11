package com.SathisKumarSan;

import java.util.Comparator;
import java.util.PriorityQueue;
class ExampleObject{
	String str;
	int rollNo;
}
public class PriorityQueueExample implements Comparator<ExampleObject> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 6;
		PriorityQueue<ExampleObject> pq = new PriorityQueue<ExampleObject>(len,new PriorityQueueExample());
		ExampleObject exObj = new ExampleObject();
		exObj.str = "Lincy";
		exObj.rollNo = 10;
		pq.add(exObj);
		ExampleObject exObj1 = new ExampleObject();
		exObj1.str = "RagaShiny";
		exObj1.rollNo = 5;
		pq.add(exObj1);
		ExampleObject exObj2 = new ExampleObject();
		exObj2.str = "Suji";
		exObj2.rollNo = 3;
		pq.add(exObj2);
		
		
		//System.out.println(pq);
	}
	@Override
	public int compare(ExampleObject o1, ExampleObject o2) {
		// TODO Auto-generated method stub
		return o1.rollNo-o2.rollNo;
	}
}  
