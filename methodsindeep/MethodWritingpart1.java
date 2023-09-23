package methodsindeep;

class Data{
	static void printSomething() {
		System.out.println("Wlecome to Method");
	}
}

public class MethodWritingpart1 {
	
	public static void main(String[] args) {
          System.out.println("In main before method call");
          
          Data.printSomething();
          
          System.out.println("In main after method call");
          }

	}


