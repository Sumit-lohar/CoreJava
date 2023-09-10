package Examples;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// sum of two binary string numbers 
    
		String x = "011011",y = "1010111";
		
		int n1  = Integer.parseInt(x,2);
		
		int n2 = Integer.parseInt(y,2);
		
		
	    int  sum =  n1+n2;
	    
	    String result = Integer.toBinaryString(sum);
	    
	    
	    System.out.println(result);
		
		
	}

}
