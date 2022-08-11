package com.BalaSan;

public class Cat2 {
	 void drink(int d) {
		System.out.print("Cat");
	}
	public static void main(String[] args) {
		PersianCat1 pcat=new PersianCat1();
		pcat.drink(12);
		pcat.drink(12.0);     
	}
}
class PersianCat1 extends Cat2{ 
    void drink(double i) {
		System.out.print("PersianCat");	
	}
}
