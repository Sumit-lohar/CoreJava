package itreation;



public class PrimeOrNot {

	public static void main(String[] args) {
         
		int  n=12, i;
		
		
		for(i=2;i<=n-1;i++) {
			
			if(n%i==0) {
				
				System.out.println("Not a Prime "+n);
				
				break;
			}
		}
		
			if(n==i)
			System.out.println("it is Prime "+n);
		
	}

}
