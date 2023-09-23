package multiThreadingPrictice1;

public class MItThreading1 {
public static void main(String[] args) {
	
	//controlling the  main thread
	
  Thread t = Thread.currentThread();
  
  System.out.println("current Thread :"+t);
  
  //change the name
  t.setName("my thread");
  
  System.out.println("After name change:"+t);
  
  try {
	  for(int n=5;n>0;n--) {
		  System.out.println(n);
		  Thread.sleep(5000);
	  }
  }
	  catch(InterruptedException e) {
		  System.out.println("Main Thread interrupted");
	  }
  }
 
}

