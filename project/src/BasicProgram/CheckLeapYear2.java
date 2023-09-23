package BasicProgram;
import java.io.*;
import java.time.*;
import java.util.Scanner;

public class CheckLeapYear2 {

	public static void isLeap(int y) {

		boolean is_leap_year = false;

		Year checkyear   = Year.of(y);
		
		is_leap_year = checkyear.isLeap();
		
		if(!is_leap_year)
            System.out.println(y+ " leap");
		else
			System.out.println(y+ " not leap");
				
	}

	public static void main(String[] args) {
           
		isLeap(2000);
		
		isLeap(2002);
		
	}

}
