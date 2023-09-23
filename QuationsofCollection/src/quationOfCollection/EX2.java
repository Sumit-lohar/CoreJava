package quationOfCollection;

import java.util.ArrayList;
import java.util.List;

public class EX2 {
	
public static void main(String[] args) {
	
	List<Character> list =  new ArrayList<>();
	
	list.add(0,'v');
	list.add('T');
	list.add(1,'E');
	list.add(3,'O');
	
	if(list.contains('O')) {
		list.remove('O');
	}
	
}
}
