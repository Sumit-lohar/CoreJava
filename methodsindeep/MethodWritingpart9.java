package methodsindeep;


class Data8{
	
	public void swap(int a,int b) {
		int t;
		
		t=a;
		a=b;
		b=t;
		
	}
	
}

public class MethodWritingpart9 {
	
	public static void main(String[] args) {
		
		Data8 d8 = new Data8();
		
		int a =100;
		int b = 200;
		
		System.out.println("Berfore Swaping a = "+a+ "b="+b);
		
		d8.swap(a,b);
		
		System.out.println("After Swaping a = "+a+ "b="+b);
		
	}
}


