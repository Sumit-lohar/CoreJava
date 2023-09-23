package BasicProgram;

import java.util.Scanner;

public class Factorialnum {
	
	public static int foctorial(int a) {
		if(a==0) 
			
			return 1;
		
		return a*foctorial(a-1);
	}

	public static void main(String[] args) {
          
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num:");
				
		a = sc.nextInt();
		
		System.out.println(foctorial(a));		
		
	}

}
