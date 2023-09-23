package DaliyCodePractice;

import java.util.Scanner;

/*
 x3/y3 = (x1/y1) + (x2/y2)
 
 x3 = (x1*y2)+(x2*y1)
 
 y3 = y1 * y2
 
 */
public class FractionnumofTwoValues {

	public static void main(String[] args) {
      
		int x1 , x2 ,y1,y2, x3 ,y3;
		
	  Scanner sc =  new Scanner(System.in);
	  
	  System.out.println("Enter the value of x1:");
	  
	  x1 = sc.nextInt();
	  
	  System.out.println("Enter the value of x2:");
	  
       x2 = sc.nextInt();
	  
	  System.out.println("Enter the value of y1:");

       y1 = sc.nextInt();
	  
	  System.out.println("Enter the value of y2:");
		
        y2 = sc.nextInt();
        
        
        int div;
        
         x3 = (x1*y2) + (x2*y1);
         
         y3 = y1 * y2;
         
         if(x3 > y3) 
        	 div = y3;
         else
        	 div = x3;
         
         for(int i=div; i> 0;i--) {
        	 if(x3 % i == 0 && y3 % i == 0) {
        		x3 = x3 /i;
        		y3 = y3 /i;
        	 }
         }
         
         System.out.println("Sum of fraction is:"+x3+"/"+y3);
        
		
	}

}
