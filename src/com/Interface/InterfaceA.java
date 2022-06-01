package com.Interface;

public interface InterfaceA {
	public void methodA();
	
	default void defaultMethodA() {
		System.out.println("Default method from interface A");
	}
	static void staticMethodA() {
		System.out.println("Static Method from Interface A");
	}
}
