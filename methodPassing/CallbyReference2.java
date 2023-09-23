package methodPassing;

public class CallbyReference2 {

	    static void  m1(Data1 pd) {
	    	
	    	System.out.println("In side the m1 pd="+pd);
	    }
	     
	
	public static void main(String[] args) {
          
		Data1 d1 = new Data1();
		
		System.out.println("In side the main d1="+d1);
		
		m1(d1);
	}



}
