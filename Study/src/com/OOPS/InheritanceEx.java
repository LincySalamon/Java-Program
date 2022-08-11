package com.OOPS;
class GrandFather{
	private void walk() {
		System.out.println("GrandFather class");
	}
}
class Father extends GrandFather{
	protected void walk() {
		System.out.println("Father class");
	}
}
class Son extends Father{
	public void walk() {
		super.walk();
		//static int i=10;
		System.out.println("Son class");
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		System.out.println("Program Start Here....");
		Son s = new Son();
		//s.Fatherwalk();
		//Father f = new Father();
		//s.walk();
	}

}
