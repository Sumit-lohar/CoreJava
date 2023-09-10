package array;

import java.util.Scanner;

public class Employee3 {
	
	int id;
	String name;
	
	
	public Employee3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	
	
	
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of Employee :");
//	int newemp =  sc.nextInt();
	
	Employee3 [] employee = new Employee3[2]; // create array and store the size of array 
	
	for(int  i =0; i<employee.length ; i++) {
		
		System.out.println("Enter the deatils:"+(i+1));
		
		System.out.println("Id :");
		int id = sc.nextInt();
		
		System.out.println("Name:");
		String name = sc.next();
		
		employee [i] = new Employee3(id, name);
		
	}
		System.out.println("Employee records");
		
		for(Employee3  s: employee ) {
			
			System.out.println(s);
			 
		}
		
		
	}
}

	 
   
	
	
	
			
			
	
