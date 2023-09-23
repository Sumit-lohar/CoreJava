package Calculator;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {

		int a;
		int b;
		char op;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a:");

		a = sc.nextInt();

		System.out.println("Enter the operation:");

		op = sc.next().charAt(0);

		System.out.println("Enter the value of b:");

		b = sc.nextInt();
		
		
		

		switch (op) {
		case '+':
			result = a + b;
			System.out.println(result);
			break;

		case '-':
			result = a - b;
			System.out.println(result);
			break;

		case '*':
			result = a * b;
			System.out.println(result);
			break;

		case '/':
			result = a / b;
			System.out.println(result);
			break;

		default:
			System.out.println("invalid operation");
		}
	

	}

}
