package com.MTIThreads3;

public class DaemonEx1 {

	public static void main(String[] args) {
        
		 Thread t = Thread.currentThread();
		 
		 System.out.println("Status of main  b4 ="+t.isDaemon());
		 
		t.setDaemon(true);
		
		 System.out.println("Status of main after  b4 ="+t.isDaemon());
		 
		 
		 System.out.println("End main");
	}

}
