package inheritance;

public class A {

	private int a=100;
	private int b=200;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	
	  @Override
	  public String toString() { return "a=" + a + ",  b=" + b ; }
	 

}
