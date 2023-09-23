package setterAndgetter;


class Data{
	
	private int x ;
	private int y ;
	
	   
	    void setData(int x, int y){
	    	
	    	this.x=x;
	    	this.y=y;
		
	}
	    
	   int  getData(){
	    	return x;
	    }
	   
	   int getData1(){ 
		   
		   return y;
	   }
	   
	   void display() {
		   System.out.println("x="+x);
           System.out.println("y="+y);
	   }
	
		
}

public class SetterAndGetter {

	public static void main(String[] args) {
        
		Data d = new Data();
//		Data d2 = new Data();
//	    Data d3 = new Data();
		
		d.setData(12, 34);
//		d2.setData(222, 333);
//		d3.setData(4444, 6666);
		
		d.display();
//		d2.display();
//		d3.display();
		
	}

}
