package itreation;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
        
		int a=0,b=1,c;
		int n,i;
		
		System.out.println("Ener the range:");
		
		Scanner sc=  new Scanner(System.in);
		
		n=sc.nextInt();
		
		System.out.print(a+","+b);
		
		for(i=1;i<=n-2;i++)
		{
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
		sc.close();
	}

}
