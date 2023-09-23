package DaliyCodePractice;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacters {

	public static void main(String[] args) {
       
		String str = "Hello";
		
		
		Map<Character, Integer> mp = new HashMap<>();
		
		for (char c: str.toCharArray()) {
			
			mp.put(c, mp.getOrDefault(c, 0)+1);
			
		}
		
		for(char c: str.toCharArray()) {
			if(mp.get(c) == 1) {
				System.out.print(c + " ");
			}
		}
		
		
		
		
	}

}
