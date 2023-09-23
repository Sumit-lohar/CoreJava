package com.threadCreation;

public class RunThread {
	public static void main(String[] args) {
		Sms s = new Sms();
		
		Thread t1 = new Thread(s);
		
		Thread t2 = new Thread(s);
		
		Thread t3 = new Thread(new Sms());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
