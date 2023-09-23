package libraryManagement;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) { // In Array

		int option = 0;

		Book[] lib = new Book[100];
		
		int bookCount = 0;

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
				if(bookCount < lib.length) {
				System.out.println("Enter Book Name to Add");
				Scanner sc1 = new Scanner(System.in);
				String bookName = sc1.nextLine();
				Book book = new Book(bookName);
				lib[bookCount] = book;
				bookCount ++;
				System.out.println("Book Added Sucessfully");
			}
				break;
			case 2:
				System.out.println("3.Display");
				for (int i =0 ; i<bookCount; i++) {
					System.out.println(lib[i].getBookname());
				}
				break;
			case 3:
				System.out.println("3.Remove");
				System.out.println("Enter the Book Name Remove:");
				String bookRemove = sc.next();
				for (int i=0; i<bookCount;i++) {
					if (lib[i].getBookname().equalsIgnoreCase(bookRemove)) {
						
						for(int j = i; i<bookCount-1; j++) {
							lib[j] = lib[j+1];
						}
						bookCount --;
						System.out.println("Book Removed Sucessfully.");
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
