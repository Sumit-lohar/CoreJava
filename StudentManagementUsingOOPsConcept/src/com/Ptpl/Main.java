package com.Ptpl;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		StudentManagement studentManage = new StudentManagement();

		Scanner sc = new Scanner(System.in);

		int ch;
		do {
			System.out.println("-----Welcome to Student Management System-----");
			System.out.println("1.Add");
			System.out.println("2.Search");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");

			ch = sc.nextInt();

			switch (ch) {
			case 1: {

				// Add

				System.out.println("Enter Student Name:");
				String sname = sc.next();
				System.out.println("Enter Student Age");
				int sage = sc.nextInt();
				System.out.println("Ente Student Id");
				int sid = sc.nextInt();

				studentManage.addStudent(new Student(sname, sage, sid));
				System.out.println("Student Added Sucessfully.");

				break;
			}
			case 2: {
				// Search

				System.out.println("Enter Student Id to find");

				int findId = sc.nextInt();

				Student foundStudent = studentManage.findStudent(findId);

				if (foundStudent != null) {
					foundStudent.displayInfo();
				} else {
					System.out.println("Student Not Found!");
				}
				break;
			}
			case 3: {
				// update

				System.out.println("Enter Student Id to update");

				int updateId = sc.nextInt();

				Student updateStudent = studentManage.findStudent(updateId);

				System.out.println("Enter Student newName:");
				String newsname = sc.next();
				System.out.println("Enter Student newAge");
				int newsage = sc.nextInt();

				updateStudent.setStudentName(newsname);
				updateStudent.setStudentAge(newsage);

				System.out.println("Updated Sucessfully");

				break;
			}

			case 4: {
				// Delete

				System.out.println("Enter Student Id to Delete");

				int deleteId = sc.nextInt();

				studentManage.deleteStudent(deleteId);

				System.out.println("Deleted Sucessfully.");

				break;
			}

			case 5: {
				System.out.println("Exit.");
				System.exit(0);
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);

			}

		} while (ch != 5);

	}
}
