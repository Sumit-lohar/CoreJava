package inheritance;

public class B extends A {
   
	
	private int a=300; // instance variable hiding

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "a of B= " + a + " a of A = " + super.getA()+" b of A ="+super.getB();
		
	}
	
	
		
	
}
