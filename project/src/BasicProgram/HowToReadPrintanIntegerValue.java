package BasicProgram;

import java.util.Scanner;

public class HowToReadPrintanIntegerValue {

	public static void main(String[] args) {
          
		int num;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the interger value:");
		
		num = sc.nextInt();
		
		System.out.println("The integer value is "+num);
		
		
	}

}
