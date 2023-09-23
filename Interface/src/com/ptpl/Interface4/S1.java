package com.ptpl.Interface4;

public interface S1 {

	static void m1() {
           System.out.println("In static m1 method an interface");
	}

	default void m2() {
		  System.out.println("In defult m2 method an interface");
	        m3();
	}
    
	
	private void m3() {
		System.out.println("In private m3 method an interface");
	}
	
	void m4();

}
