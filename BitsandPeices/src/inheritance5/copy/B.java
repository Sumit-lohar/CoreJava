package inheritance5.copy;

public class B extends A {
	
	public B  m1() {
		
		System.out.println("m1 in method of A class");
	  
		return  new B();
	}
}
