package Examples;

import java.util.Scanner;

public class Ex7 {
	
	static int largest(int a,int b,int c) {
//		
//		if(a>b && a>c) {
//			System.out.println("a is largest");
//		}
//		else if(b >a && b >c){
//			System.out.println("b is largest");
//		}
//		else {
//			System.out.println("c is largest");
//		}
		
		return c > (a >b ? a :b) ? c : ((a >b) ? a:b);
		
	}

	public static void main(String[] args) {
		
		//Largest of three numbers
		
		int a,b,c,r;
		
		System.out.println("Enter any number:");
		
		Scanner sc =  new Scanner(System.in);
		
	    a =sc.nextInt();
	    b =sc.nextInt();
	    c = sc.nextInt();
	    
		r = largest(a, b, c);
		
		System.out.println(r+ " is largest");
		
		
	}

}
