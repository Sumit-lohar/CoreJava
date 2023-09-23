package squence;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
         
		evenOrodd();
	}

	private static void evenOrodd() {
		int a;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter any number:-");
	    
	    a = sc.nextInt();
	    
	    if(a%2==0) {
	    	System.out.println("Even "+ a);
	    }
	    else
	    {
	    	System.out.println("Odd "+ a);
	    }
	}

}
