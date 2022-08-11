package com.SathisKumarSan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

//Given the head of a singly linked list, reverse the list, and return the reversed list.
//Example: Input: head = [1,2,3,4,5]
//       Output: [5,4,3,2,1]

//reverse a doubly linked list 
public class LinkedListReverse {
	

	private void reverseList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		System.out.println(list);
		Iterator<Integer> i = list.descendingIterator();
		System.out.println("Linked List element after reverse");
		System.out.print("[");
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.print("]");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LinkedListReverse().reverseList();
	}
}
