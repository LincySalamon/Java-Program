package com.BalaSan;

public class Cat1 {
	
	private void drink() { 
		System.out.println("Cat is drinking");
	}
	public static void main(String[] args) {
		Cat1 pcat=new PersianCat();//reference cat1 so invoked private void drink()  
		pcat.drink();
	}                
}  
class PersianCat extends Cat1{      
     void drink() {
		System.out.println("Persian Cat is drinking");	
	}
}