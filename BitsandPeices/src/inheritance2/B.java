package inheritance2;

public class B extends A {
   
	
	public int x=500;  //instance variable hiding

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	

	public void display() {
		System.out.println("x of super = "+super.x);
		System.out.println("x of sub = "+x);
	}
		
	
}
