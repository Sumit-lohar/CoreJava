package squence;

import java.util.Scanner;

public class Largstnumber {

	public static void main(String[] args) {
         largestNum();
	}

	private static void largestNum() {
		int a,b, c;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter any num:-");
         
         a = sc.nextInt();
         b = sc.nextInt();
         c =sc.nextInt();
         
         if(a>b) {
        	 if(a>c) 
                 System.out.println("a is largest"+ a);		 
        	 else 
        		 System.out.println("c is largest"+ c); 
         }
         else
        	 if(b>c)
        		 System.out.println("b is largest"+ b);
        	 else
        		 System.out.println("c is largest"+ c);
	}
}
