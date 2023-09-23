package methodsindeep;


class Data4{
	
	void square (int a) {
		System.out.println(a*a);
	}
	
	int  square2 (int a) {
		return a*a;
	}
	
}

public class MethodWritingpart5 {
	
	public static void main(String[] args) {
		Data4 d4 = new Data4();
		
		d4.square(6);
		
		int result = d4.square2(4);
		
		System.out.println(result);
	}
}


