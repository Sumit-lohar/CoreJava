package multiThreadingPrictice2;

public class TestNewThread {
	
public static void main(String[] args) {
	
	
   NewThread1 nt  = new NewThread1();
	
	nt.t.start();
	
	try {
		for(int i=0;i<=5;i++) {
			System.out.println("this is main thread:"+i);
			Thread.sleep(1000);
		}
	}
		catch(Exception e) {
			System.out.println("thread is main handling");
		}
		System.out.println("Exiting the main thread");
	}
	
 
}
