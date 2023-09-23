package multiThreadingPrictice2;

public class NewThread1 implements Runnable {
	Thread t;

	public NewThread1() {
		t = new Thread(this, "DemoThread");
		System.out.println("THis is the thread" + t);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("this is thread:" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("thread is handling");
		}
		System.out.println("Exiting the thread");
	}

}
