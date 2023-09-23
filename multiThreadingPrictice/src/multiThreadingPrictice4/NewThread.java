package multiThreadingPrictice4;

public class NewThread implements Runnable{

	String name;
	Thread b;
	
	public NewThread(String name) {
		this.name = name;
		b= new Thread(this, name);
		System.out.println("new thread:"+b);
	}

	@Override
	public void run() {
         System.out.println("this is a thread ");		
	}
		
}
