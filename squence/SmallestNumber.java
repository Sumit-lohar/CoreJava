package squence;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
         smallestNum();
	}

	private static void smallestNum() {
		int a,b, c;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter any num:-");
         
         a = sc.nextInt();
         b = sc.nextInt();
         c =sc.nextInt();
         
         if(a<b) {
        	 if(a<c) 
                 System.out.println("a is smallest"+ a);		 
        	 else 
        		 System.out.println("c is smallest"+ c); 
         }
         else
        	 if(b<c)
        		 System.out.println("b is smallest"+ b);
        	 else
        		 System.out.println("c is smallest"+ c);
	}
}
