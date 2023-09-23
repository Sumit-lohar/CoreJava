package multiThreadingPrictice1;

public class MItThreading3 implements Runnable {
	// creating the new Thread
	
	Thread t ;
	
	
	public MItThreading3() {
		t =  new Thread(this,"Demo Thread");
		System.out.println("Child thread:"+t);
	}
	

	@Override
	public void run() {
		try {
			for(int i=5;i<=10;i++) {
				System.out.println("child thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("child thread");
		}
		System.out.println("Exiting child thread ");
	}		
 
}
 


