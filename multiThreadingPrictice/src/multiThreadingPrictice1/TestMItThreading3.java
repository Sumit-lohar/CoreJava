package multiThreadingPrictice1;

public class TestMItThreading3 {
	
	public static void main(String[] args) {
		
		MItThreading3 nt = new MItThreading3();
		
		nt.t.start();
		
		try {
		for(int i=5;i<=10;i++) {
			System.out.println("main thread: "+i);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException e) {
		System.out.println("main thread");
	}
	System.out.println("Exiting main thread ");
		
	}
	
}		
 

 


