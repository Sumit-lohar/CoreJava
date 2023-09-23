package com.threadCreation;

public class Instagram implements Runnable {
         
	Thread t;
	String name;
	
	
	
	public Instagram(String name) {
		this.name=name;
		t = new Thread(this,this.name);
	}



	@Override
	public void run() {
             System.out.println("Sending on whatsapp using thread"+t.getName());		
	}
   
}
