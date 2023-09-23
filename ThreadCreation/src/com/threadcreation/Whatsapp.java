package com.threadcreation;

public class Whatsapp implements Runnable {
      
	Thread a;
	
	public Whatsapp() {
	    a = new Thread();
	    
	    System.out.println("I'm Whatsapp"); 	
	}
	@Override
	public void run() {
		 System.out.println("I'm Whatsapp2"); 	
	}
      
}
