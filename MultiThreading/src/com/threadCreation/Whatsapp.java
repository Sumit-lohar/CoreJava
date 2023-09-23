package com.threadCreation;

public class Whatsapp implements Runnable {
         
	Thread t;
	
	
	
	public Whatsapp() {
		t = new Thread(this);
	}



	@Override
	public void run() {
             System.out.println("Sending on whatsapp....");		
	}
   
}
