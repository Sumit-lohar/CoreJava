package DaliyCodePractice;

import java.util.Scanner;

public class AlphabetOrNumber {

	public static void main(String[] args) {
      
		char a;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter alphabet or number:");
		
		a = sc.next().charAt(0);
		
		
		if(a >= 'a'  && a<='z') {
			System.out.println("Alphabet =  "+a);
		}
		else {
			System.out.println("Number = "+a);
		}		
		
	}

}
