package assignment;


class Area{
	double a;
	void area(){
		
		System.out.println("mensuration formula Overloading "+a);
		System.out.println("==================");
	}
	void area(int l,int b) {
		a=l*b;
		System.out.println("Area of Rectangle "+a);
		System.out.println("==================");
	}
	void area(int a) {
		a=a*a;
		System.out.println("Area of square "+a);
		System.out.println("==================");
	}
	void area(short l,int h) {
		a=l*h;
		System.out.println("Area of Prallelogram "+a);
		System.out.println("==================");
	}
	void area(double b,long h) {
		a=0.5*b*h;
		System.out.println("Area of Triangle "+a);
		System.out.println("==================");
	}
}

public class MensurationFormaulaOverloading {

	public static void main(String[] args) {
           
		 Area a1 = new Area();
		 
		 a1.area();
		 a1.area(12, 23);
		 a1.area(14, 24);
		 a1.area(22);
		 a1.area(4 , 5);
	}

}
