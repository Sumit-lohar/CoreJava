package squence;

import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
         addtwonum();
   }

	 static void addtwonum() {
		int a,b,sum;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter a num:");
         
         a=sc.nextInt();
         b=sc.nextInt();
         
         sum=a+b;
         
         System.out.println("sum " +sum);
	}

}
