package methodsindeep;


class Data5{
	
	void square (int a) {
		System.out.println(a*a);
	}
	
	int  square2 (int a) {
		return a*a;
	}
	
}

public class MethodWritingpart6 {
	
	public static void main(String[] args) {
		Data4 d4 = new Data4();
		
		d4.square(6);
		
		int result = d4.square2(4);  // functional Expression Method
		
		System.out.println(result);
	}
}


