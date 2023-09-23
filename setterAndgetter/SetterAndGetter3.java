package setterAndgetter;

class Data3{
	
	public void m1(int a) {
		
		System.out.println(" in side the m1 a="+a);
		
		a= 5000;
	}
}

public class SetterAndGetter3 {

	public static void main(String[] args) {
		     
		Data3 d3 = new Data3();
		
	    int a=100;
	    
	    System.out.println("in main a="+a);
	    
	    d3.m1(a);
	    
	    System.out.println("In main Method a = "+a);		 
	}

}
