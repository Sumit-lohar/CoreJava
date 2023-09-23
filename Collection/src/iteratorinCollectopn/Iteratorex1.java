package iteratorinCollectopn;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorex1 {

	public static void main(String[] args) {
     
		ArrayList<Integer> al = new ArrayList<>();
		
		
		al.add(55);
		al.add(44);
		al.add(66);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			Integer element  = itr.next();
		    
			System.out.println(element);
		
		}
		
	}

}
