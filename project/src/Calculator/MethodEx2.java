package Calculator;

import java.util.Scanner;

public class MethodEx2 {

	public static void m1( int a) {

		if(a % 2 == 0) {
			System.out.println("even"+a);
		}
		else {
			System.out.println("odd"+a);
		}
		
		
		
	}

	public static void main(String[] args) {
		
	  int a;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the value:");
	  a = sc.nextInt();
	  
	  
	  
	  m1(a);
	  
	}
}
