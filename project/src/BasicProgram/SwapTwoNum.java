package BasicProgram;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
          
		int a ; 
		int b ;
		int t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Two num:");
		
		a= sc.nextInt();
		b =sc.nextInt();
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("A= "+a+"B= "+b);
		
	}

}
