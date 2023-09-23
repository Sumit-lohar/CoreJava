package DaliyCodePractice;

import java.util.Scanner;

public class Quadreant {
	
	
	public static void  quadrant(int x,int y) {
		
		if(x>0 && y>0) {
			System.out.println("I quadrant");
		}
		else	if(x<0 && y>0) {
			System.out.println("II quadrant");
		}
		else	if(x<0 && y<0) {
			System.out.println("III quadrant");
		}
		else if(x>0 && y<0) {
			System.out.println("IV quadrant");
		}
		else if(x==0 && y==0) {
			System.out.println("Origin");
		}
		else if(x==0 && y<0 || x < 0 && y==0 ) {
			System.out.println("x-axis");
		}
		else {
			System.out.println("y-axis");
		}
			
	}
	

	public static void main(String[] args) {
		
		int a ;
		int b;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("ENter the value of x and y:-");
		
		a =sc.nextInt();
		b= sc.nextInt();
		
		
		
		quadrant(a, b);
	}

}
