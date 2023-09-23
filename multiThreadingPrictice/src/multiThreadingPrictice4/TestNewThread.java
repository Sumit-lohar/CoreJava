package multiThreadingPrictice4;

public class TestNewThread {

	public static void main(String[] args) {
          
		NewThread  nt1  =  new NewThread("sumit");
		NewThread  nt2  =  new NewThread("sumit");
		NewThread  nt3  =  new NewThread("sumit");
		
		nt1.b.start();
		nt2.b.start();
		nt3.b.start();
		
	
	}
}
