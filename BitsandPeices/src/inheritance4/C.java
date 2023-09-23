package inheritance4;

public class C extends B {
	
	public int k;
	
	public C(int i,int j,int k) {
		super(i,j);
		this.k=k;
	}
		
	void display() {
		System.out.println(i+" "+j+" "+k);
	}
}
