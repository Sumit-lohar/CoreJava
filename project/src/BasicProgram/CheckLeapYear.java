package BasicProgram;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
       
		int n;
		
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Enter the any year:");
	     
	     n =  sc.nextInt();
	     
	     if(n % 4 == 0 && n % 400 == 0 ) 
	    	 System.out.println("Leap "+n);
	     
	     else 
	    	 System.out.println("not Leap "+n);
	     
		
		
		
	}

}
