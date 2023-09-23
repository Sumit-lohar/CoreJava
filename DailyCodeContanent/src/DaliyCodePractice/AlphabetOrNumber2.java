package DaliyCodePractice;

import java.util.Scanner;

public class AlphabetOrNumber2 {
	
	   public static void alphaOrnum(char a) {
		   
		   if(a >= 'a'  &&  a<='z') {
				System.out.println("Alphabet =  "+a);
			}
			else {
				System.out.println("Number = "+a);
			}	
	   }
	public static void main(String[] args) {
      
		char a;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter alpha & num:");
		
		a = sc.next().charAt(0);
		
		alphaOrnum(a);
		
	}

}
