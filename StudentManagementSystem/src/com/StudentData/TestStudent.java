package com.StudentData;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[2];

		int ch;

		do {

			System.out.println("-----Welcome Student Management System----");

			System.out.println("1.Add");
			System.out.println("2.Update");
			System.out.println("3.Display");
			System.out.println("4.Delete");
			System.out.println("0.Exit");

			ch = sc.nextInt();

			switch (ch) {
			case 1: {
				System.out.println("-----Welcome Student Management System----");
				// Add
				for (int i = 0; i < stu.length; i++) {

					System.out.println("New Record" + (i + 1));

					System.out.println("Enter Id:");
					int id = sc.nextInt();

					System.out.println("Enter name:");
					String name = sc.next();

					stu[i] = new Student(id, name);

					System.out.println("Student Record Added Successfully.");

				}

				/*
				 * for (Student student : stu) { System.out.println(student); }
				 */

			}
				break;
			case 2: {
				System.out.println("-----Updating Student Data----");
				
				System.out.println("Enter the Student Id:");
				int updateId = sc.nextInt();

				// Update

				for (int i = 0; i < stu.length; i++) {
					if (stu[i].id == updateId) {
						System.out.println("Enter Id:");
						int newId = sc.nextInt();

						System.out.println("Enter name:");
						String newName = sc.next();

						stu[i].id = newId;
						stu[i].name = newName;

						System.out.println("Updated successfully.");
                     
					}
				}

			}
				break;
			case 3: {
				System.out.println("-----Displaying Student Data-----");
				
				// display
				for (int i = 0; i < stu.length; i++) {
					System.out.println(stu[i].toString());
				}
			}
				break;
			case 4: {
				System.out.println("-----Deleting Student Data-----");
				
				// Delete
				System.out.println("Enter the student Id:");
				int dele_t = sc.nextInt();

				

				for (int i = 0; i < stu.length; i++) {
					if ( stu[i].id == dele_t) {
						for (int j = 0; j < stu.length - 1; j++) {
							stu[i] = stu[i + 1];
						}
						stu[stu.length - 1] = null;

						System.out.println("Deleted successfully.");
						
						break;
					}  				}

			}
				break;
			case 0: {
				System.out.println("Exit");
				System.exit(0);

			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);

			}

		} while (ch != 0);

	}

}
