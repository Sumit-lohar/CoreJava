package Com.ExceptionHandling;

public class ExceptionExSolution1 {

	public static void main(String[] args) {

		String s = null;

		try {
			s.toUpperCase();
		} catch (Throwable t) {
			System.out.println("Welcome to error");
		}

	}

}
