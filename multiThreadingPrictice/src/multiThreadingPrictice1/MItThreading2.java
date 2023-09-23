package multiThreadingPrictice1;

public class MItThreading2 {
public static void main(String[] args) {
	
	
	Thread r = Thread.currentThread();
	
	System.out.println("Before set name:"+r);
	
	r.setName("sumit");
	
	System.out.println("After set name"+r);
	
	try {
		for(int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(1000);   
	}
}
	catch(InterruptedException e) {
		System.out.println("interrupted");
		
	}
	
 
  }
 
}

