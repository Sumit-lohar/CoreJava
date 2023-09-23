package BasicProgram;

import java.util.Scanner;

public class LargestNumOfThree {

	public static void main(String[] args) {
          
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the any three num:");
		
		a= sc.nextInt();
		b =sc.nextInt();
		c=sc.nextInt();
		
		
		if(a > b) {
			if(a > c) {
			System.out.println("a is largest"+a);
			}
			else {
				System.out.println("c is largest"+c);
			}	
		  }
		else {
			if(c > b) {
				System.out.println("c islargest"+c);
			}
			else {
				System.out.println("b is largest"+b);
			}
		}
		
		
		
		
		
		
	}

}
