package BasicProgram;

import java.util.Scanner;

public class ShowAllPrimenum {

	public static void main(String[] args) {
           
		int n,i,c=0;
		
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter the num:");
		
		n = sc.nextInt();
		
		
			for(i=2;i<n;i++) {
				if(n % i == 0) {
					c = c+1;
				}
			}
			if(c>0) {
				System.out.println("not Prime");
			}
			else {
				System.out.println("Prime");
			}
	}
}