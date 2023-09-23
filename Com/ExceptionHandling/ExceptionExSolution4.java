package Com.ExceptionHandling;

public class ExceptionExSolution4 {

	public static void main(String[] args) {
       
		//java.lang.OutOfMemoryError
		
		try {
			int a[]=new int[1000000000*100];
		}
		catch(VirtualMachineError v) {
			System.out.println(" we use virtualMachineError...");
		}
		
	}

}
