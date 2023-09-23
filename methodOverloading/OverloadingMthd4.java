package methodOverloading;


class Ovrlodg3{
	
	static {
		
		System.out.println("In side the Static1");
		
		{
			System.out.println("In side the Static3");
		}
	}
	
	{
		System.out.println("In side the non-static");
	}
	
	Ovrlodg3(){
		System.out.println("In side the ctor");
	}
}

public class OverloadingMthd4 {

	public static void main(String[] args) {
		Ovrlodg3 o3 = new Ovrlodg3();
		
		System.out.println("In side the main");
	}

}
