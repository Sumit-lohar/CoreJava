package Examples;

import java.util.Scanner;

public class Ex6 {
	
	static void evenORodd(int n) {
		
		if(n % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}
	

	public static void main(String[] args) {
		
		//EVEN OR ODD
		int n;
		
		System.out.println("Enter any number:");
		
		Scanner sc=  new Scanner(System.in);
		
		n = sc.nextInt();
		
		 evenORodd(n);
		
		
		
	}

}
