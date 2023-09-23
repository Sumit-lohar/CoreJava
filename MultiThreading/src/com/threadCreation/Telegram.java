package com.threadCreation;

public class Telegram implements Runnable {
         
	Thread t;
	
	
	
	
	public Telegram() {
		t = new Thread(this," This is telegram thread");
	}



	@Override
	public void run() {
             System.out.println("Sending on whatsapp using thread"+t.getName());		
	}
   
}
