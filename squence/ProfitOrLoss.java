package squence;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
        
		profitOrloss();
	}

	private static void profitOrloss() {
		int cp,sp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the cost price:");
		
		cp = sc.nextInt();
		
		System.out.println("Enter the selling price");
		
		sp = sc.nextInt();
		
	    if(cp>sp) {
	    	System.out.println("Shopkeeper has a incurred a loss of "+(cp-sp));
	    }
	    else if(sp>cp) {
	    	System.out.println("Shopkeeper has made profit of "+(sp-cp));
	    }
	    else
	    	System.out.println("There is a break even ...");
	    
	    sc.close();
	}
	

}
