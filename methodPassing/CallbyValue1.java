package methodPassing;

public class CallbyValue1 {

	      static void m1(int a) {
	    	  System.out.println("Inside m1 "+a);
	      }
	
	
	public static void main(String[] args) {
           
		int a=100, b=200, c=300;
		
		//m1(500);
		
		m1(b);
		
		
	}

}
