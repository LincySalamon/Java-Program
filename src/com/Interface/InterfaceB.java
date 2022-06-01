package com.Interface;

public interface InterfaceB {
	public void methodB();
	
	default void defaultMethodA() {
		System.out.println("Default method from Interface B");
	}
	static void staticMethodA() {
		System.out.println("Static Method from Interface B");
	}
}
