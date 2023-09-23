package methodOverloading;


class Ovrlodg{
	
	void m1() {
		System.out.println("in m1 0 parameter");
	}
	void m1(int a) {
		System.out.println("in m1 1 parameter");
	}
	void m1(int a, int b) {
		System.out.println("in m1 2 parameter ");
	}
}

public class OverloadingMthd1 {

	public static void main(String[] args) {
		Ovrlodg o = new Ovrlodg();
		
		o.m1();
		o.m1(78);
		o.m1(43, 65);
		
	}

}
