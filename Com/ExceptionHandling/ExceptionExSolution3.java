package Com.ExceptionHandling;

public class ExceptionExSolution3 {

	public static void main(String[] args) {
       
		int a[] = new int [5];
		
		try {
			a[5]=10; 	
		}
		catch(Exception e){
			System.out.println("Array index out of bound error");
		}
		
	}

}
