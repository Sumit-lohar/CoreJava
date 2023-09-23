package methodsindeep;

class StaticornonStatic{
	static void printSomething() {
		System.out.println("Welcome to static");
	}
	
	void dosomething() {
		System.out.println("Welcome to non-static");
	}
}

public class Method2 {

	public static void main(String[] args) {
        
		StaticornonStatic.printSomething();
		
		System.out.println("In main before object creating");
		
		StaticornonStatic sc = new StaticornonStatic();
		
		sc.dosomething();
		
		//Another way to object Create
		
		new StaticornonStatic().dosomething();
		
		System.out.println("After object creating");
		
	
		
	}

}
