package com.BalaSan;

public class ThreadExamples extends Thread {

	@Override
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println("Coming from thread       1  "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExamples threadObj = new ThreadExamples();
		threadObj.start();
		//threadObj.start();//illegal thread safe exception
		for(int i=0;i<=100;i++)
		{
			System.out.println("Coming from main   "+i);
		}
	}
}
