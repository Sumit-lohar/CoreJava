package com.MTIThreads3;

import com.MTIThreads2.MyThread1;

public class DaemonEx3 {

	public static void main(String[] args) {
        
		MyThread1  m1 = new MyThread1();
		
		System.out.println(m1.isDaemon());
		m1.setDaemon(true);
		System.out.println(m1.isDaemon());
		
		m1.start();
		System.out.println("End of main");
	}

}
