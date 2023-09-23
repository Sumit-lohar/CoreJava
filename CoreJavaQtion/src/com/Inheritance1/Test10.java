
  package com.Inheritance1;
  
  
  
  
  public class Test10 {
   String msg = null;
  
   public Test10() {
       this("Good Morning!");
   }
  
   public Test10(String str) {
       msg = str;
   }
  
   public void display() {
       System.out.println(msg);
   }
  
   public static void main(String [] args) {
       Test10 g1 = new Test10();
       Test10 g2 = new Test10("Good Evening!");
       g1.display();
       g2.display();
   }
}

 