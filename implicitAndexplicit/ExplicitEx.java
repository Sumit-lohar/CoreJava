package implicitAndexplicit;

public class ExplicitEx {

	public static void main(String[] args) {
        
		byte b;
		
		int a = 100;
		
		//b=a  does not workhere;
		
		b=(byte)a;
		
		System.out.println(b);
	}

}
