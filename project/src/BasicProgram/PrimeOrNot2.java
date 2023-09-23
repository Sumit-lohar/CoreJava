package BasicProgram;

import java.util.Scanner;

public class PrimeOrNot2 {

	public static void main(String[] args) {
        
		int n, i,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  any num:");
		
		
		n = sc.nextInt();
		c= sc.nextInt();
		
	         for(i=2;i<n;i++) {
	        	 if(n%i==0) {
	        		 c= c+1;
	        	 }
	        	 
	        	 if(c>0) {
	        		 System.out.println("not a prime");
	        	 }
	        	 else {
	        		 System.out.println("Prime");
	        	 }
		}
		
	}

}
