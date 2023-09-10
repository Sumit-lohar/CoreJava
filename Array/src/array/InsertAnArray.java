package array;

import java.util.Scanner;

public class InsertAnArray {

	public static void main(String[] args) {

     	int[] a  = {10,20,30,40,50};
		int pos;
		int element;
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter position:");
		pos = sc.nextInt();
		
		System.out.println("Enter your insert element :");
		element =  sc.nextInt();
		
	

		for (int i = a.length- 1; i < pos - 1; i++) {

			a[i] = a[i - 1];
		}

		a[pos -1] = element;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
