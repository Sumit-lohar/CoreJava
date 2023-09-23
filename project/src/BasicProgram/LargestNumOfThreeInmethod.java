package BasicProgram;

import java.util.Scanner;

public class LargestNumOfThreeInmethod {

	public static int largestnum(int a, int b, int c) {

		if (a >= b && a > c) 

			return a;

		 else 
			if (b > a && b > c)

				return b;

			else
				
				return c;
			
		}

	

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int largest;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any three num:");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		largest =largestnum(a, b, c);
		
		System.out.println("largest"+largest);

	}	
}
