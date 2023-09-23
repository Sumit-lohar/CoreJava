package assignment;

import java.util.Scanner;

public class Kilometertomcmm {

	public static void main(String[] args) {
           
		double km,m,cm,mm;
		
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter a the any value:-");
	        
	        km = sc.nextDouble();
	        
	        
	        m=1000*km;
	        cm=100*m;
	        mm=10*cm;
	        
	        System.out.println("The km to m: "+m);
	        System.out.println("the m to cm:"+cm);
	        System.out.println("the cm to mm:"+mm);
	}

}
