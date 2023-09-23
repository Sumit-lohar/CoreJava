package method2;

public class Method4 {

	static void printSomethig() {
		System.out.println("Welcome to the static");
	}
	
	void doSoething() {
		System.out.println("Welcome to the non-static");
	}
	
	public static void main(String[] args) {
         System.out.println("In main before the calling");
         
         printSomethig();
       
         System.out.println("In main after the calling ");
         
         Method4 m4 =new Method4(); //creating object
         
         m4.doSoething();
       
         //new Method4().doSoething(); //creating object
       
	}

}
