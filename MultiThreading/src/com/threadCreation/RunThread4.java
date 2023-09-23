package com.threadCreation;

public class RunThread4 {
	public static void main(String[] args) {
		
		Instagram w1  = new Instagram(" Rohit");
		
		Instagram w2  = new Instagram(" sumit");
		
		Instagram w3  = new Instagram(" amit");
		
		w1.t.start();
		w2.t.start();
		w3.t.start();
		
		
		
		
		
	
		
	}
}
