package array;

import java.util.Scanner;

public class Employee {
	
	int id;
	String name;
	

	public 	Employee (int id, String name) {
		this.id = id;
		this.name = name;
	}	
	
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
}


//public void update (int newId, String newName) {
//	this.id = newId;
//	this.name = newName;
//}	


public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of Employee :");
	int newEmp =  sc.nextInt();
	
	Employee [] employee = new Employee[newEmp]; // create array and store the size of array 
	
	for(int  i =0; i<newEmp ; i++) {
		
		System.out.println("Enter the deatils:"+(i+1));
		
		System.out.println("Id :");
		int id = sc.nextInt();
		
		System.out.println("Name:");
		String name = sc.next();
		
		employee [i] = new Employee(id, name);
		
	}
		System.out.println("Employee records");
		
		for(Employee  s: employee ) {
			
			System.out.println(s);
			 
		}
		
	       // Update employee record
        System.out.println("Enter the ID of the employee you want to update:");
        int updateId = sc.nextInt();

        for (int i = 0; i < newEmp; i++) {
            if (employee[i].id == updateId) {
                System.out.println("Enter the new ID:");
                int newId = sc.nextInt();
                System.out.println("Enter the new name:");
                String newName = sc.next();

                // Update the employee's information
                employee[i].id = newId;
                employee[i].name = newName;

                System.out.println("Employee record updated successfully.");
                break; // Exit the loop since we found the employee to update.
            }
        }

        System.out.println("Updated Employee records");
        for (Employee emp : employee) {
            System.out.println(emp);
        }
    }
		
}


	 
   
	
	
	
			
			
	
