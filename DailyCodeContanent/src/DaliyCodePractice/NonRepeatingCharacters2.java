package DaliyCodePractice;

public class NonRepeatingCharacters2 {

	public static void main(String[] args) {
       
		String  s = "Hello";
		
		boolean  b = true;
		
		for (char i:s.toCharArray()) {
			
			if(s.indexOf(i) == s.lastIndexOf(i)) {
				
				System.out.println("non-repating char"+i);
				
				b = false;
				
				break;
				
			}
			
			if(b) {
				System.out.println("repating char");
			}
			
		}
		
		
	}

}
