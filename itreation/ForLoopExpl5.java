package itreation;

import java.util.Scanner;

public class ForLoopExpl5 {

	public static void main(String[] args) {
           
	int i,n;
	Scanner sc=  new Scanner(System.in);
	
	System.out.println("Enter the range:");
	
	n=sc.nextInt();
	
	for(i=1;i<=n;i++) {
		
		System.out.print(i);
	}
   }

}
