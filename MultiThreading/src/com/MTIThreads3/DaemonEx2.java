package com.MTIThreads3;

public class DaemonEx2 {

	public static void main(String[] args) {
        
		 Thread t = Thread.currentThread();
		 
		 System.out.println("Status of main  b4 ="+t.isDaemon());
		 try {
			 t.setDaemon(true); 
		 }
		 catch(java.lang.IllegalThreadStateException e) {
			 System.out.println("handled");
		 }
		 
		
		 System.out.println("Status of main after  b4 ="+t.isDaemon());
		 
		 
		 System.out.println("End main");
	}

}
