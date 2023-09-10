package array;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
          
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int numberofSize [] = new int[size];
		
		for(int j=0;j<size;j++) {
			numberofSize[j] = sc.nextInt();
		}
		
		for(int i=0; i<size;i++) {
			System.out.println(numberofSize[i]);
		}
		
		
	}

}
