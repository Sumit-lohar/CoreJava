package DaliyCodePractice;

import java.util.Scanner;

public class VowelOrConsonant {
   
	public static void main(String[] args) {
		
		char v;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the vowel or consoneant:");
		
		v = sc.next().charAt(0);
		
		if(v == 'a' | v == 'e' | v == 'i' | v == 'o' | v == 'u') {
			
			System.out.println("vowel");
			
		}
		else {
			System.out.println("consonant");
		}	
		
	}
}
