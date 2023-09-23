package BasicProgram;

import java.util.Scanner;

public class FindPerimeterofRectangle {

	public static void main(String[] args) {
         
		double l,b,R;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value");
		
		l = sc.nextDouble();
		b =sc.nextDouble();
		
		
		R = 2*(l+b);
		
		System.out.println("The perimeter of Rectangle is :"+R);
	}

}
