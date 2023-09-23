package DaliyCodePractice;

import java.util.Scanner;

public class Strongnum2 {
	
	  public static int fac(int n) {
		  
			/*
			 * int f =1,i;
			 * 
			 * for( i=1;i<=n;i++) f=f*i;
			 * 
			 * return f;
			 */
		  
		  //OR
		  
		  if(n==0)
			  
			 return 1;
		  
		  return n*fac(n-1);
		  
			  
			  
		  
	  }

	public static void main(String[] args) {
			
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int n = sc.nextInt();
		
		int sum=0 , n1=n;
		
		while(n!=0) {
			
			int d = n%10;
			sum = sum + fac(d);
			n = n/10;
			
		}
		
		if(sum==n1) {
			System.out.println("This num is Strong");
		}
		else {
			System.out.println(" This num is not Strong");
		}
	}

}
