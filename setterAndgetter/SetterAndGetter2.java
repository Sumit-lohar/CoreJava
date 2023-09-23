package setterAndgetter;


class Data1{
	
	public int a;
	public int b;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
		
}

public class SetterAndGetter2 {

	public static void main(String[] args) {
        
		Data1 d1 = new Data1();
		
		d1.setA(12);
		d1.setB(34);
		
		System.out.println(d1.getA());
		System.out.println(d1.getB());
		
		
		
	}

}
