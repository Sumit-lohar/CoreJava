package BasicProgram;

import java.util.Scanner;

public class CheckLeapYear3 {

	public static void isLeap(int y) {

		boolean is_leap_year = false;

		is_leap_year = (y % 4 == 0 && y % 400 == 0)

				? true
				: false;

		if (!is_leap_year)
			System.out.println(y + ": non leap year");
		else
			System.out.println(y + ": leap year");
	}

	public static void main(String[] args) {
           
		isLeap(2000);
		
		isLeap(2002);
		
	}

}
