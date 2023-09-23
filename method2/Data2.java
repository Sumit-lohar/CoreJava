package method2;

public class Data2 {
   
	public void m1(int a) {
		System.out.println("inside m1 a="+a);
		a=5000;
	}
     

public static void main(String[]args) {
	int a=100;
	
	Data2 d2 = new Data2();
	
	System.out.println("Inside the main a="+a);
	
	d2.m1(a);
	
	System.out.println("Inside the main after call a="+a);
  }
}