package multiThreadingPrictice3;

public class NewThread extends Thread{
   
	Thread a ;
	

	public NewThread(int i) {
		super("Demo Thread");
		System.out.println("This is Thread"+this);
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("this is thread:"+i);
				Thread.sleep(1000);
			}
		}
			catch(Exception e) {
				System.out.println("thread is handling");
			}
			System.out.println("Exiting the thread");
	}
	
}
