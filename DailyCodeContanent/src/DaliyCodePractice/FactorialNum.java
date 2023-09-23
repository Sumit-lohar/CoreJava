package DaliyCodePractice;

import java.util.Scanner;

public class FactorialNum {
	
	
	public static int factorialNum(int n) {
		
		if(n==0) 
			
	     return 1;
			
		return n*factorialNum(n-1);
		
		
		
	}
	
	public static void main(String[] args) {
         int n;
         
         Scanner sc =  new Scanner(System.in);
         
         System.out.println("Enter the num:");
         
         n= sc.nextInt();
         
		 System.out.println(factorialNum(n));
		
	}

}
