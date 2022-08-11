package com.BalaSan;

import java.util.Scanner;

public class ThreadExample extends Thread {
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the String");
			String str = sc.nextLine();
			System.out.println("Printing from child thread "+str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample te = new ThreadExample();	
		te.start();
		SecondThread st = new SecondThread();
		Thread t1 = new Thread(st);
		t1.start();
	}
}
class SecondThread implements Runnable{

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
				System.out.println("It is a time for drinking");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



