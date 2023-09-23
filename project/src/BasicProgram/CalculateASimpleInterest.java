package BasicProgram;

import java.util.Scanner;

public class CalculateASimpleInterest {

	public static void main(String[] args) {
   
		double P ,T ,R;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the values:");
		
		P = sc.nextDouble();
		T =sc.nextDouble();
		R = sc.nextDouble();
		
		
		double SI = P*T*R;
		
		System.out.println("simple interest is"+SI);
		
		
		
	}

}
