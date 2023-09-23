package libraryManagement;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // In Collection

		int option = 0;

		LinkedList<Book> lib = new LinkedList<Book>();


		do {
			System.out.println("Welcome to Libarary");
			System.out.println("MENU");
			System.out.println("1.Add Book");
			System.out.println("2.Search ");
			System.out.println("3.Remove");
			System.out.println("4.EXit");
			Scanner sc = new Scanner(System.in);
			System.out.println("PLease enter a option");
			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				System.out.println("Enter Book Name to Add");
				Scanner sc1 = new Scanner(System.in);
				String bookName = sc1.nextLine();
				Book book = new Book(bookName);
				lib.add(book);
				System.out.println("Book Added Sucessfully");
				break;
			case 2:
				System.out.println("3.Display");
				for (Book b : lib) {
					System.out.println(b.getBookname());
				}
				break;
			case 3:
				System.out.println("3.Remove");
				System.out.println("Enter the Book Name Remove:");
				String bookRemove = sc.next();
				for (Book b : lib) {
					if (b.getBookname().equalsIgnoreCase(bookRemove)) {
						lib.remove(b);
						System.out.println("Book Removed Sucessfully");
					}
				}
				break;
			case 4:
				System.out.println("Exit");
                System.exit(0);
			}

		} while (option != 4);

	}

}
