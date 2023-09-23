package methodPassing;

public class CallbyReference {

	     public static void swap(int a,int b) {
	    	 int t;
	    	 
	    	 t=a;
	    	 a=b;
	    	 b=t;
	    	 
	     }
	
	public static void main(String[] args) {
          
		int a=100,b=200;
		
		swap(a, b);
		
		System.out.println("a="+a+"b="+b);
	}

}
