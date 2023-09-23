package BasicProgram;

import java.util.Scanner;

public class Factorialnum3 {
	
	public static int factorial(int n) {
		
		return (n==1 || n==0) ? 1  : n*factorial(n-1);
		
		
	}
	
	

	public static void main(String[] args) {
          
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value:");
		
		n = sc.nextInt();
		
		System.out.println(factorial(n));
		
		
	}

}
