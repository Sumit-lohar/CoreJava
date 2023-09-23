package com.Inheritance1;

import java.util.Scanner;

public class Demo1 {
	
	
	
	void m3() {
		System.out.println("m3 is method");
	}
	
   public static void m1() {
	   System.out.println("im a static");
	}
   
   public void m2() {
	   System.out.println("im a non static");
	}

public Demo1() {
	System.out.println("consturotor");
}
   
 

public static void main(String[] args) {
     Demo1  d1 = new Demo1();
 	
    d1.m2();
    d1.m3();
   
    Demo1.m1();

	
	
	
}
}
