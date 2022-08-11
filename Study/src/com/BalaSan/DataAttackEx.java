package com.BalaSan;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class DataAttackEx implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int success = 0;
		try {
			isReachable("http://google.com");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private boolean isReachable(String string) {
		String targetUrl = null;
	//	URLConnection url = new URL(targetUrl).openConnection(); 
		return false;
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
