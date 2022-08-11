package com.BalaSan;


public class Cat extends Animal 
{
	public Cat() {   
		super(3);
		System.out.print("Cat");
	}
	public static void main(String[] args) {
		new Animal(3);
	}  
}

class Animal { 
	public Animal(int y) { 
		System.out.print("Animal");
	}
}


