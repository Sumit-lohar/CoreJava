package methodsindeep;


class Data7{
	private   int x=100;
	private  int y=200;
	
	void dispalyData() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}

public class MethodWritingpart8 {
	
	public static void main(String[] args) {
		
		Data6 d6  = new Data6();
		
		Data6 d = d6;
		
		d.dispalyData();
	      
		
	}
}


