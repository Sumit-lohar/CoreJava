package Com.ExceptionHandling;

public class ExceptionEx5 {

	public static void main(String[] args) {
       
		System.out.println(" in main ...");
		
		//java.lang.StackOverflowError
		String s[] = null;
		
		main(s);
	}

}
