package BasicProgram;

public class LCMOfTwonum {
	
	static int GCD(int a,int b) {
      
		if(a == 0) 
		
		return b;
		return GCD(b % a , a);
		
	}
	
	static int LCM(int a, int b) {
		
		return(a / GCD(a ,b) * b); 
	}
	

	public static void main(String[] args) {
         
		int a =25 ;
		int b =15;
		
		System.out.println("LCM of" + a + "and" + b + "is" + LCM(a,b));
		
	}

}
