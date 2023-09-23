package inheritance5.copy;

public class C extends B {

	public C m1() {
		System.out.println("m1 in method of A class");
	
	       return new C();
	}
	
}
