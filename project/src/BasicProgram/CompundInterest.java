package BasicProgram;

public class CompundInterest {

	public static void main(String[] args) {
     
		double P=10000,R=5,T=5;
		
		double CI = P*(Math.pow(1 + R /100, T) );
		
		System.out.println("Compound Interest is:"+CI);
	}

}
