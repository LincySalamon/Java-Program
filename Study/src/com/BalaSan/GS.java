package com.BalaSan;

public class GS {
	static void sayHello()
	{
		System.out.println("Hello");
		//sayHi();
	}
	void sayHi()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		sayHello();
		GS g=new GS();
		g=null;
		g.sayHello();
	}

}
