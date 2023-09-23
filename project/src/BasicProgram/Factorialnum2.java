package BasicProgram;

public class Factorialnum2 {
	
	public static int factorial(int n) {
		
		int a = 1 , i ;
		
		for(i=2;i<=n;i++) 
			
			a*=i;
		
			return a;
		
		
	}
	
	

	public static void main(String[] args) {
          
		int n =5;
		
		System.out.println(factorial(5));
		
		
	}

}
