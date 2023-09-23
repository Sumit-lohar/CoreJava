package multiThreadingPrictice3;

public class TestNewThread {

	public static void main(String[] args) {
          
		NewThread nt =  new NewThread(12);
		
		nt.start();
		
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("This is main thread"+i);
				Thread.sleep(500);
			}
	    }
		catch(Exception e) {
			System.out.println("A thread main.");
		}
		System.out.println("Existing Thread");
	}
	

}
