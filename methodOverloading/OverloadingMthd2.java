package methodOverloading;


class Ovrlodg1{
	
	int i,j,k;
	
	Ovrlodg1(){
		i=j=k=0;
	}
	Ovrlodg1(int pi){
		i=pi;
	}
	Ovrlodg1(int pi,int pj){
		i=pi;
		j=pj;
	}
	Ovrlodg1(int pi,int pj,int pk){
		i=pi;
		j=pj;
		k=pk;
	}
	
	void display() {
		System.out.println("i="+i+" j="+j+" k="+k);
	}
	
	
}

public class OverloadingMthd2 {

	public static void main(String[] args) {
		Ovrlodg1 o1 =  new Ovrlodg1();
		Ovrlodg1 o2 =  new Ovrlodg1(100);
		Ovrlodg1 o3 =  new Ovrlodg1(100,200);
		Ovrlodg1 o4 =  new Ovrlodg1(100,200,300);
		
		o1.display();
		o2.display();
		o3.display();
		o4.display();
	}

}
