package BasicProgram;

import java.util.Scanner;

public class SwapTwoNum2 {

	public static void main(String[] args) {

		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Two num:");

		a = sc.nextInt();
		b = sc.nextInt();

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("A= " + a + "B= " + b);

	}

}
