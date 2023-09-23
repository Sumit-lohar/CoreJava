package DaliyCodePractice;

import java.util.Scanner;

public class ASCIIValueFindOut2 {

	public static void main(String[] args) {
         
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the char:");
		
		ch = sc .next().charAt(0);
		
		
		int asciivalue = ch;
		
		System.out.println("ASCII value is:"+asciivalue);	
		
	}

}
