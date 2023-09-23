package method;

public class MethodEx4 {
	
	void m1(int...x) {
		System.out.println("This is method with var args/param");
		
		
		System.out.println("X="+x);
	}
	public static void main(String[] args) {
        MethodEx4 e1 = new MethodEx4();
        
        e1.m1();
        e1.m1(10);
        e1.m1(11,22,33,44,55,66,77,99);
	}
}
