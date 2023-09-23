package DaliyCodePractice;

import java.util.Scanner;

public class ASCIIValueFindOut {
	
	
	    void asciiValue(char ch) {
		   
		   int asciivalue  =  ch;
		   
		   System.out.println("ASCII value is:"+asciivalue);
		     
	   }
	
	public static void main(String[] args) {
		
		ASCIIValueFindOut a =  new ASCIIValueFindOut();
         
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character:");
		
		ch = sc.next().charAt(0);
		
		
		a.asciiValue(ch);
		
		
		
	}

}
