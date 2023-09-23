package methodOverloading;
// you created the sub class  this code will not work.
public class OverloadingMthd5 {

static int x=100;   
	
	static {
		System.out.println("inside the static");
		
		System.out.println("inside the static x"+x);
		
		x=500;
	}
	{
		System.out.println("In side the non-static");
	}
	
	public static void main(String[] args) {
		
         System.out.println("Inside the main");
		
		System.out.println("Inside the main x="+x);
		
		OverloadingMthd5 o5 = new OverloadingMthd5();
	}

}
