package com.Inheritance1;

import java.util.Scanner;

public class CoffeOrder2 {
	
	//q = no.quentity
	//a = A,C,L;
	//n = Americano/Cappuccino/Latte

	public static void order(int q, char a, String n) {
		int output1;
		int price;

		if (q < 0) {
			output1 = 1;
			System.out.println(output1);
		}

		else {
			if (n == "Americano") {

				switch (a) {
				case 'A':

					price = 200 * q;
					output1 = price;
					System.out.println(output1);
					break;
				
				default:
					output1 = -1;
					System.out.println(output1);
					break;
				}
			}

			else {
				if (n.equals(n)) {

					switch (a) {
					
					case 'C':

						price = 300 * q;
						output1 = price;
						System.out.println(output1);
						break;
					

					default:
						output1 = -1;
						System.out.println(output1);
						break;
					}
				} else {
					if (n == "Latte") {

						switch (a) {
						
					
						case 'L':

							price = 500 * q;
							output1 = price;
							System.out.println(output1);
							break;

						default:
							output1 = -1;
							System.out.println(output1);
							break;
						}
					}
					else {
						output1 = 0;
						System.out.println(output1);
								
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		
//		order(-1, 'C',"Cappuccino");
		
		Scanner sc =  new Scanner(System.in);
		
		
		System.out.println("Enter the quentity:");
		int  q = sc.nextInt();
		
		System.out.println("Enter the code of coffe:");
		char a = sc.next().charAt(0);
		
		System.out.println("Enter the name:");
		
		String n = sc.next();
		
		
		order(q, a, n);
		
		
		
	}

}
