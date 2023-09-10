package array;

import java.util.Scanner;

public class Employee2 {
	
	int id;
	String name;
	
	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int numEmployees = scanner.nextInt();

		// Create an array to store employee records
		Employee2[] employees = new Employee2[numEmployees];

		// Input employee records
		for (int i = 0; i < numEmployees; i++) {
			System.out.println("Enter details for Employee " + (i + 1));
			System.out.print("ID: ");
			int id = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character
			System.out.print("Name: ");
			String name = scanner.nextLine();

			// Create an Employee object and store it in the array
			employees[i] = new Employee2(id, name);
		}

		// Display the employee records
		System.out.println("Employee Records:");
		for (Employee2 employee : employees) {
			System.out.println(employee);
		}

		// Close the scanner
		scanner.close();
	}
}
