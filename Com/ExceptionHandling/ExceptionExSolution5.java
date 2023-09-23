package Com.ExceptionHandling;

public class ExceptionExSolution5 {

	public static void main(String[] args) {
       
		System.out.println(" in main ...");
		
		//java.lang.StackOverflowError
		String s[] = null;
		
		try {
			main(s);
		}
		catch(StackOverflowError f) {
			System.out.println("Exception handled");
		}
		
	
	}

}
