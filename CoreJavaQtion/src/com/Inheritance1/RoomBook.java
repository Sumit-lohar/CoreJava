package com.Inheritance1;

import java.util.Scanner;

public class RoomBook {
		// input2 ==> AC/ NonAC
		// input3 ==> C/H/B
		// input1 ==> no. of day

		public static void roomrent(int input1, String input2, char input3)
	    {
	        int output1;
	        int rent;
	        if (input1 < 0)
	        {
	            output1 = 1;
	          System.out.println(output1);
	        }
	        else
	        {
	            if (input2 == "AC")
	            {
	                switch (input3)
	                {
	                    case 'C':
	                        rent = 1800 * input1;
	                        output1 = rent;
	                       System.out.println(output1);
	                        break;
	                    case 'H':
	                        rent = 1400 * input1;
	                        output1 = rent;
	                       System.out.println(output1);
	                        break;
	                    case 'B':
	                        rent = 1900 * input1;
	                        output1 = rent;
	                       System.out.println(output1);
	                        break;
	                    default:
	                        output1 = -1;
	                       System.out.println(output1);
	                        break;

	                }
	            }
	            else if (input2 == "NON-AC")
	            {
	                switch (input3)
	                {
	                    case 'C':
	                        rent = 800 * input1;
	                        output1 = rent;
	                       System.out.println(output1);
	                        break;
	                    case 'H':
	                        rent = 900 * input1;
	                        output1 = rent;
	                       System.out.println(output1);
	                        break;
	                    case 'B':
	                        rent = 1000 * input1;
	                        output1 = rent;
	                       System.out.println(output1);
	                        break;
	                    default:
	                        output1 = -2;
	                        System.out.println(output1);
	                        break;

	                }

	            }
	            else
	            {
	                output1 = 0;
	               System.out.println(output1);
	            }
	        }
	    }
	   public static void main(String[] args) {
		   
//		   Scanner sc = new Scanner(System.in);
//		   
//		   System.out.println("Enter days:");
//		   
//		   int input1 =sc.nextInt();
//		   
//		   System.out.println("Enter the AC or NON-ac");
//		   
//		   String input2 = sc.next();
//		   
//		   System.out.println("Enter the loction");
//		   
//		   char input3 = sc.next().charAt(0);
		   
	       roomrent(1, "AC", 'C');
	    }
	}
