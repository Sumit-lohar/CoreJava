package methodOverloading;


class Ovrlodg2{
	int i=100,j=200,k=300;
	
	{
		System.out.println("In instance block i="+i+" j="+j+" k="+k);
		
		i=11;
		j=22;
		k=33;
	}
	
	Ovrlodg2(){
		System.out.println("In constructor i="+i+" j="+j+" k="+k);
	}
	
	
}

public class OverloadingMthd3 {

	public static void main(String[] args) {
		Ovrlodg2 o2 = new Ovrlodg2();
		
		int i=10;
		int j=20;
		int k=30;
		
		System.out.println("In main Method i="+i+" j="+j+" k="+k);
	}

}
