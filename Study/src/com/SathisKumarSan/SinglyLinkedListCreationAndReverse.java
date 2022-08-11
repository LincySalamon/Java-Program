package com.SathisKumarSan;

public class SinglyLinkedListCreationAndReverse {
	//node of singly linked list
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	//represent head and tail of singly linked list
	public Node head = null;
	public Node tail = null;
	
	//add new node to the list
	
	public void addNode(int data) {
		//create a new node object
		
		Node newNode = new Node(data);    
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display() {
		Node current = head;
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Nodes of singly linked list");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListCreationAndReverse singlyLinkedList = new SinglyLinkedListCreationAndReverse();
		singlyLinkedList.addNode(5);
		singlyLinkedList.addNode(4);
		singlyLinkedList.addNode(3);
		singlyLinkedList.addNode(2);
		singlyLinkedList.addNode(1);
		
		singlyLinkedList.display();
	}

}
