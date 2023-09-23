package itreation;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
	       
		
		int n,i,f=1;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		n=sc.nextInt();
		
		for(i=n;i>1;i--) {
			
			f=f*i;
			
			System.out.println("Factorial of" +n+ "=" +f);
		}
				
	}

}
