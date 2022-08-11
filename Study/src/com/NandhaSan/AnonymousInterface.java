package com.NandhaSan;

public class AnonymousInterface {
	public class B{
		public void method2() {
			
		}
	}
	public void method1() {
		System.out.println("From method  from parent class");
		MethodInterface mi = new MethodInterface() {

			@Override
			public void click() {
				System.out.println("in interface method");
			}
		};
		mi.click();
	}
	
	public interface MethodInterface{
		public void click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousInterface().method1();
	}

}
