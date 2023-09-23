package quationOfCollection;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EX3 {
	
public static void main(String[] args) {
	
	List<LocalDate> date = new ArrayList<>();
	
	date.add(LocalDate.parse("2023-12-2"));
	
	date.add(LocalDate.parse("2023-12-3"));
	
	date.add(LocalDate.parse("2023-12-4"));
	
	date.add(LocalDate.of(1980, Month.AUGUST, 31));
	
	//date.remove(x -> x.getYear()<2000);
	
	System.out.println(date);
}
}
