package BasicProgram;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		int n;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any num:");

		n = sc.nextInt();
	
		
		if(n % 2 == 0) {
			System.out.println("Even "+n);
		}
		else {
			System.out.println("odd "+n);
		}

	}

}
