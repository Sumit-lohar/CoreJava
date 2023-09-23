package BasicProgram;

import java.util.Scanner;

public class LargestNumOfThree2 {

	public static void main(String[] args) {
          
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the any three num:");
		
		a= sc.nextInt();
		b =sc.nextInt();
		c=sc.nextInt();
		
		
		if(a > b && a > c) { 
			
			System.out.println("a is largest"+a);
			
		}	
		else {
			if(b > a && b > c)
				
				System.out.println("b is largest"+b);
		
		
			else
				System.out.println("c is largest"+c);
		}
	}

}
