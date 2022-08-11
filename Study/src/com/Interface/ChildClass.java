package com.Interface;

public class ChildClass extends ParentClass implements InterfaceA,InterfaceB{

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("Method from InterfaceA");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("Method from InterfaceB");
	}
	
	@Override
	public void defaultMethodA() {
		// TODO Auto-generated method stub
		InterfaceA.super.defaultMethodA();
		InterfaceB.super.defaultMethodA();
	}

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.defaultMethodA();
		cc.methodA();
		cc.methodB();
		cc.defaultMethodA();
		InterfaceA.staticMethodA();
		InterfaceB.staticMethodA();
		cc.defaultMethod();
		cc.staticMethodA();
	}
}
