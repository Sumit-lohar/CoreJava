package method2;

public class Method2 {
      
	void swap(int a,int b) {
		int t;
		
		t=a;
		a=b;
		b=t;
		
	}
	
	public static void main(String[] args) {
		  Method2 m2 = new Method2();
		  int a=100, b=200;
		  
		  System.out.println("before swapping a="+a+"b="+b);
		  
		  m2.swap(a, b);
		  
		  System.out.println("After swapping a="+a+"b="+b);
	}
	
	
}
