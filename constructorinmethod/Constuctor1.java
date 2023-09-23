package constructorinmethod;



class Ctor1{
	private int x;
	private int y;
	
	
	Ctor1(){
		x=100;
		y=200;
	}
	
	public void display() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	
}

public class Constuctor1 {

	public static void main(String[] args) {
         
		Ctor1 c1 = new Ctor1();
		
		c1.display();
	}

}
