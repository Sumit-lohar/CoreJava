package com.Inheritance1;

public class CoffeOrder {

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
				case 'C':

					price = 300 * q;
					output1 = price;
					System.out.println(output1);
					break;
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
				if (n == "Cappuccino") {

					switch (a) {
					case 'A':

						price = 200 * q;
						output1 = price;
						System.out.println(output1);
						break;
					case 'C':

						price = 300 * q;
						output1 = price;
						System.out.println(output1);
						break;
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
				} else {
					if (n == "Latte") {

						switch (a) {
						case 'A':

							price = 200 * q;
							output1 = price;
							System.out.println(output1);
							break;
						case 'C':

							price = 300 * q;
							output1 = price;
							System.out.println(output1);
							break;
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
		order(1, 'C', "Cappuccino");
	}

}
