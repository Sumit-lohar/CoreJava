package squence;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
        
		leapOrnot();
		
	}

	private static void leapOrnot() {
		int y ;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter a year:");
		
		y= sc.nextInt();
		
		if(y%4==0 || y%400==0) {
			System.out.println("Leap year " + y);
		}
		else {
			System.out.println("Not leap year"+ y);
		}
	}

}
