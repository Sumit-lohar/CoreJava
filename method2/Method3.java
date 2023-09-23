package method2;

public class Method3 {

	static void printSomethig() {
		System.out.println("Welcometo the Method");
	}
	
	public static void main(String[] args) {
         System.out.println("In main before the calling");
         
         printSomethig();
         
         System.out.println("In main after the calling ");
	}

}
