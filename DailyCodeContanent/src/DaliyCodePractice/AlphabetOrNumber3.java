package DaliyCodePractice;

import java.util.Scanner;

public class AlphabetOrNumber3 {

	public static void main(String[] args) {
//    
//		int num = 10;
//		String message = (num > 5) ? "Number is greater than 5" : "Number is less than or equal to 5";
//		System.out.println(message);

		char a;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the aplhabet or Number:-");

		a = sc.next().charAt(0);

		String message = (a >= 'a' && a <= 'z') ? "it is alphabet" : "it is Number";

		System.out.println(message);

	}

}
