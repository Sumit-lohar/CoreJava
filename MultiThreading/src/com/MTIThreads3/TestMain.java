package com.MTIThreads3;

public class TestMain {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println(t);

		t.setName("thread ing");
		System.out.println(t);
	}

}
