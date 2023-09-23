package method;

public class MethodEx2 {
	
	void m1(int x) {
		System.out.println("Method with no zero and param");
		
		System.out.println("X="+x);
	}
	public static void main(String[] args) {
        MethodEx2 e1 = new MethodEx2();
        
        e1.m1(100);
	}
}
