package methodPassing;

public class CallbyReference4 {
         
	public static void swap(Data2 d2) {
		int t;
		
		t=d2.a;
		d2.a=d2.b;
		d2.b=t;	
	}
	       
	public static void main(String[] args) {
          
		Data2 d2 =  new Data2();
		
		 swap(d2);
		 
		 System.out.println("a="+d2.a+"b="+d2.a);
	}

}
